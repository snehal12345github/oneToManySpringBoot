package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Policy;
import com.velocity.repository.PolicyRepository;
import com.velocity.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		Policy policies = policyRepository.save(policy);

		return policies;
	}

}
