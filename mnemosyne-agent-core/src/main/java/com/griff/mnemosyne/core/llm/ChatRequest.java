package com.griff.mnemosyne.core.llm;

import com.griff.mnemosyne.core.model.Message;

import java.util.List;

/**
 * 大语言模型请求参数
 * 该对象描述一次模型调用所需的完整参数 不依赖于任何具体的模型供应商
 *
 * @param model
 * @param messages
 * @param temperature
 * @param maxTokens
 * @param stream
 */
public record ChatRequest(String model, List<Message> messages, Double temperature, Integer maxTokens, boolean stream) {

    public ChatRequest {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("模型不能为空");
        }

        if (messages == null || messages.isEmpty()) {
            throw new IllegalArgumentException("消息不能为空");
        }

        messages = List.copyOf(messages);

        if (temperature != null && (temperature < 0 || temperature > 2)) {
            throw new IllegalArgumentException("温度参数需要在0到2之间");
        }

        if (maxTokens != null && maxTokens <= 0) {
            throw new IllegalArgumentException("最大Token参数必须大于0");
        }
    }
}
