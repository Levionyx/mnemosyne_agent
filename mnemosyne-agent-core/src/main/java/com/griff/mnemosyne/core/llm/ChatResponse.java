package com.griff.mnemosyne.core.llm;

import com.griff.mnemosyne.core.model.AssistantMessage;

/**
 * 大语言模型响应
 *
 * @param message      模型返回内容
 * @param finishReason 结束相关的结果原因
 * @param usage        token使用情况
 */
public record ChatResponse(AssistantMessage message, FinishReason finishReason, TokenUsage usage) {

    public ChatResponse {
        if (message == null) {
            throw new IllegalArgumentException("消息不能为空");
        }

        if (finishReason == null) {
            finishReason = FinishReason.UNKNOWN;
        }
    }
}
