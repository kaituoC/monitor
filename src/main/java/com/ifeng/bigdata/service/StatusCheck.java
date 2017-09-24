package com.ifeng.bigdata.service;

import com.ifeng.bigdata.entity.HealthStatus;
import org.springframework.stereotype.Service;

/**
 * Created by chang on 2017/9/24.
 */
@Service
public class StatusCheck {

    public HealthStatus check() {
        HealthStatus healthStatus = new HealthStatus();

        if (healthStatus.getStatus() == null) {
            healthStatus.setStatus(HealthStatus.Status.SUCCESS);
        }
        return healthStatus;
    }
}
