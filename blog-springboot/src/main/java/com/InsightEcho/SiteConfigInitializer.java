package com.InsightEcho;

import com.InsightEcho.entity.SiteConfig;
import com.InsightEcho.service.SiteConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 * ClassName:SiteConfigInitializer
 * Package:com.InsightEcho
 * Description:
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 下午10:19
 * @Version:v1.0
 */
@Component
public class SiteConfigInitializer implements CommandLineRunner {

    private final SiteConfigService siteConfigService;

    @Autowired
    public SiteConfigInitializer(SiteConfigService siteConfigService) {
        this.siteConfigService = siteConfigService;
    }

    @Override
    public void run(String... args) throws Exception {
        SiteConfig siteConfig = siteConfigService.getSiteConfig();
        System.out.println("SiteConfig initialized: " + siteConfig);
    }
}
