package com.griff.mnemosyne.core.model;

/**
 * 工具执行结果消息
 *
 * @param toolCallId 对应的工具调用 ID
 * @param content 工具执行结果
 */
public record ToolResultMessage(String toolCallId,String content) implements Message {

    @Override
    public String role() {
        return "tool";
    }
}
