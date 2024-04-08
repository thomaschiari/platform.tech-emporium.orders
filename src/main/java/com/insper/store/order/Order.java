package com.insper.store.order;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true, chain = true)
public record Order (
    String id,
    Integer productId,
    Integer quantity,
    String email
) { }