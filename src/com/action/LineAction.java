package com.action;

import com.convertor.Line;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by KevenTao on 2017/2/26.
 */
public class LineAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Line line;  //Line属性

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
