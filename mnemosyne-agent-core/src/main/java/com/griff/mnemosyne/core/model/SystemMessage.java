package com.griff.mnemosyne.core.model;

/**
 * 系统消息。
 */
public record SystemMessage(String content) implements Message {

    @Override
    public String role() {
        return "system";
    }
}
