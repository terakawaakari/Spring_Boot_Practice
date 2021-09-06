package com.example.demo.login;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class LoginParamController {
	@RequestMapping("/loginParam1")
	public String loginParam1(@RequestParam(required = false) String id, @RequestParam(required = false) String pass) {
	    if (id == null || pass == null) {
	    	return "ログイン情報を入力してください";
		} else if (id.equals("") || pass.equals("")) {
			return "ログインに失敗しました";
		}
		return "ログインに成功しました(ID：" + id + "、PASS：" + pass + ")";
	}
	
	@RequestMapping({"/loginParam2", "/loginParam/{id}", "/loginParam2/{id}/{pass}"})
	public String loginParam2(@PathVariable(required = false) String id, @PathVariable(required = false) String pass) {
		if (id == null || pass == null) {
			return "ログイン情報を入力してください";
		}
		if (id.equals("") || pass.equals("")) {
			return "ログインに失敗しました";
		}
		return "ログインに成功しました(ID：" + id + "、PASS：" + pass +")";
	}
}
