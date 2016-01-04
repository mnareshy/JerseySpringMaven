package com.sample;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sample.TransactionBO;

@Component
@Path("/payment")
public class PaymentService {

	@Autowired
	TransactionBO transactionBO;

	@GET
	@Path("/some")
	public Response savePayment() {

		String result = transactionBO.save();

		return Response.status(200).entity(result).build();

	}

}
