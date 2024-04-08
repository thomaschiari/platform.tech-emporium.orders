package com.insper.store.order;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true, chain = true)
public record OrderIn (
    String productId,
    Integer quantity,
    String email
) { }