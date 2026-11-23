
package com.griff.mnemosyne.core.llm;

/**
 * 模型生成结束原因。
 */
public enum FinishReason {

    /**
     * 正常结束。
     */
    STOP,

    /**
     * 模型请求调用工具。
     */
    TOOL_CALLS,

    /**
     * 达到 Token 长度限制。
     */
    LENGTH,

    /**
     * 内容安全限制。
     */
    CONTENT_FILTER,

    /**
     * 未知结束原因。
     */
    UNKNOWN
}
