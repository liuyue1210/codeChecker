package com.liuyue.controller;

import com.liuyue.model.resultParameter;
import com.liuyue.service.ICodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/code")
public class CodeController {

    @Resource
    private ICodeService codeService;

    @RequestMapping("/check")
    @ResponseBody
    public ModelAndView check(@RequestParam("testDir") String testDir) {
        ModelAndView mv = new ModelAndView("view");

        resultParameter result = codeService.check(testDir);

        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
