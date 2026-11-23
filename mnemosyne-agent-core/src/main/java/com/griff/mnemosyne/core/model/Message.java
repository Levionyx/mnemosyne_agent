package com.griff.mnemosyne.core.model;

/**
 * Agent 与大语言模型之间的消息抽象。
 */
public sealed interface Message
        permits SystemMessage, UserMessage, AssistantMessage, ToolResultMessage {

    /**
     * 获取消息角色。
     */
    String role();
}
