package com.griff.mnemosyne.core.model;

import java.util.List;

/**
 * 模型消息
 *
 * @param content   模型正常回复的文本 允许为 null
 * @param toolCalls 模型要求执行的工具列表
 */
public record AssistantMessage(String content, List<ToolCall> toolCalls) implements Message {

    public AssistantMessage {
        toolCalls = toolCalls == null ? List.of() : List.copyOf(toolCalls);
    }

    @Override
    public String role() {
        return "assistant";
    }
}
