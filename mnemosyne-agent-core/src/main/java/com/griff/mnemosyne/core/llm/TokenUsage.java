package com.griff.mnemosyne.core.llm;

public record TokenUsage(int promptTokens, int completionTokens, int totalTokens) {
    public TokenUsage {
        if (promptTokens < 0 || completionTokens < 0 || totalTokens < 0) {
            throw new IllegalArgumentException("Token 数量不可为负数");
        }
    }
}
