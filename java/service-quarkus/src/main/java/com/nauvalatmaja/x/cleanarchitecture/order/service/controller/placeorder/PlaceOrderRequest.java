package com.nauvalatmaja.x.cleanarchitecture.order.service.controller.placeorder;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PlaceOrderRequest {
	private String userId;
	private String shippingAddress;
	private List<PlaceOrderItemRequest> items;
}
