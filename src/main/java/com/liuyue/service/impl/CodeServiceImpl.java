package com.liuyue.service.impl;

import com.liuyue.model.resultParameter;
import com.liuyue.service.ICodeService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service("codeService")
public class CodeServiceImpl implements ICodeService {

    @Override
    public resultParameter check(String testDir) {
        resultParameter result = new resultParameter();

        Process proc;
        try {
            String command = "";    // 执行py文件的命令
            proc = Runtime.getRuntime().exec(command);  // 执行py文件
            // 用输入输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            // 读取结果写入result
            while ((line = in.readLine()) != null) {
                result.setTotalGrade(Double.parseDouble(line));
                result.setPylint(line);
                result.setSlc(Integer.parseInt(line));
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
