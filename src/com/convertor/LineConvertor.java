package com.convertor;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by KevenTao on 2017/2/26.
 */
//public class LineConvertor extends StrutsTypeConverter{
//    @Override
//    public Object convertFromString(Map context, String[] values, Class totype) {
//        //请求参数为字符串数组
//        String[] params = (String[]) values;
//        String param = params[0];
//        Line line = new Line();//创建Line实例
//        StringBuilder temp = new StringBuilder();
//        char ch;
//        int j = 0;
//        //字符串正确形式为(x1,y1,x2,y2),遍历param中的每个元素
//        for (int index=0;index<param.length();index++){
//            ch = param.charAt(index);//询问param元素
//            if (ch!=','&&ch!='('&&ch!=')'){
//                temp.append(ch);
//            } else if (ch==','||ch==')'){
//                //判断第几个数字
//                switch (j){
//                    //第一个数字
//                    case 0:
//                        line.setX1(Integer.parseInt(temp.toString()));//设置第一个数字到line对象中
//                        temp.delete(0,temp.length());//清空temp
//                        break;
//                    //第二个数字
//                    case 1:
//                        line.setY1(Integer.parseInt(temp.toString()));//设置第二个数字到line对象中
//                        temp.delete(0,temp.length());//清空temp
//                        break;
//                    case 2:
//                        line.setX2(Integer.parseInt(temp.toString()));
//                        temp.delete(0,temp.length());
//                        break;
//                    case 3:
//                        line.setY2(Integer.parseInt(temp.toString()));
//                        temp.delete(0,temp.length());
//                        break;
//                    default:
//                        break;
//                }
//                j++;
//            }
//        }
//        return (Object)line;
//    }
//
//    @Override
//    public String convertToString(Map context, Object o) {
//        Line line = (Line) o;
//        return "("+line.getX1()+","+line.getY1()+","+line.getX2()+","+line.getY2()+")";
//    }
//}

public class LineConvertor extends DefaultTypeConverter{
    @Override
    public Object convertValue(Map<String, Object> context, Object value, Class toType) {
        //字符串转向Line类类型
        if (toType==Line.class){
            String[] params = (String[])value;
            String param = params[0];
            Line line = new Line();//创建Line类型实例
            StringBuilder temp = new StringBuilder();//创建StringBuilder类型实例
            char ch;
            int j = 0;
            //字符串正确形式为(x1,y1,x2,y2),遍历param中的每个元素
            for (int index=0;index<param.length();index++){
                ch = param.charAt(index);//访问param元素
                //将数字提取出来
                if (ch!=','&&ch!='('&&ch!=')'){
                    temp.append(ch);
                } else if(ch==','||ch==')'){
                    //判断第几个数字
                    switch (j){
                        //第一个数字
                        case 0:
                            line.setX1(Integer.parseInt(temp.toString()));//设置第一个数字到line中
                            temp.delete(0,temp.length());
                            break;
                        case 1:
                            line.setY1(Integer.parseInt(temp.toString()));
                            temp.delete(0,temp.length());
                            break;
                        case 2:
                            line.setX2(Integer.parseInt(temp.toString()));
                            temp.delete(0,temp.length());
                            break;
                        case 3:
                            line.setY2(Integer.parseInt(temp.toString()));
                            temp.delete(0,temp.length());
                            break;
                        default:
                            break;
                    }
                    j++;
                }
            }
            return (Object)line;
        }else if (toType == String.class){
            Line line = (Line)value;
            return (Object)("("+line.getX1()+","+line.getY1()+","+line.getX2()+","+line.getY2()+")");
        }
        return null;
    }
}
