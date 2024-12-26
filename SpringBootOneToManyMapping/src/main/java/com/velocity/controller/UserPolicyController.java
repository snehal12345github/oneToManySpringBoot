package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.model.User;
import com.velocity.service.PolicyService;
import com.velocity.service.UserService;

@RestController
public class UserPolicyController {

	// Inject both service
	@Autowired
	private UserService userService;

	@Autowired
	private PolicyService policyService;

	@PostMapping("/userPolicy")

	public User saveUserPolicy(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		List<Policy> policies = user.getPolicyList();
		for (Policy policy : policies) {
			policy.setUserId(user.getId());
			policyService.savePolicy(policy);
		}
		return user1;

	}

}
