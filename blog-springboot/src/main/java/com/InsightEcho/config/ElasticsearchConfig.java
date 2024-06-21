package com.InsightEcho.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:ElasticsearchConfig
 * Package:com.InsightEcho.config
 * Description:Elasticsearch配置
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 下午5:29
 * @Version:v1.0
 */
@Configuration
public class ElasticsearchConfig {
    @Value("${elasticsearch.username}")
    private String username;

    @Value("${elasticsearch.password}")
    private String password;

    @Value("${elasticsearch.hostname}")
    private String hostname;

    @Value("${elasticsearch.port}")
    private int port;

    @Value("${elasticsearch.scheme}")
    private String scheme;

    @Value("${elasticsearch.connTimeout}")
    private int connTimeout;

    @Value("${elasticsearch.socketTimeout}")
    private int socketTimeout;

    @Value("${elasticsearch.connectionRequestTimeout}")
    private int connectionRequestTimeout;

    @Bean
    public ElasticsearchClient elasticsearchClient() {
        // BasicCredentialsProvider 用于设置 Elasticsearch 的用户名和密码，以实现基本身份验证。
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));

        // 创建 RestClient 实例
        RestClient restClient = RestClient.builder(new HttpHost(hostname, port, scheme))
                .setRequestConfigCallback(requestConfigBuilder -> requestConfigBuilder
                        .setConnectTimeout(connTimeout)
                        .setSocketTimeout(socketTimeout)
                        .setConnectionRequestTimeout(connectionRequestTimeout)
                ).setHttpClientConfigCallback(f -> f.setDefaultCredentialsProvider(credentialsProvider)).build();

        // 创建 RestClientTransport 实例。
        // 使用 RestClientTransport 将 RestClient 实例传递给 ElasticsearchTransport。
        // 使用 JacksonJsonpMapper 作为 JSON 序列化和反序列化的映射器。
        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

        // 创建 ElasticsearchClient 实例
        return new ElasticsearchClient(transport);
    }
}
