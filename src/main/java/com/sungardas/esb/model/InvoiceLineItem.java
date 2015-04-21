package com.sungardas.esb.model;

public class InvoiceLineItem {

		private long id;		// PK
		private long invoiceId;
		// removed orderId  (already referenced in Invoice)
		private long orderLineItemId;	  // do we need the Invoice Line Item in line with the Order Line Item?
		private long usageId;
		// why is the tax at the invoice line item level
		private long tax;		// % or amount in currency?  how to map to a ledger account/category? 
		private long discount;	 // in %  or amount in currency?
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public long getInvoiceId() {
			return invoiceId;
		}
		public void setInvoiceId(long invoiceId) {
			this.invoiceId = invoiceId;
		}
		public long getOrderLineItemId() {
			return orderLineItemId;
		}
		public void setOrderLineItemId(long orderLineItemId) {
			this.orderLineItemId = orderLineItemId;
		}
		public long getUsageId() {
			return usageId;
		}
		public void setUsageId(long usageId) {
			this.usageId = usageId;
		}
		public long getTax() {
			return tax;
		}
		public void setTax(long tax) {
			this.tax = tax;
		}
		public long getDiscount() {
			return discount;
		}
		public void setDiscount(long discount) {
			this.discount = discount;
		}
		
}
