package org.sid.cinema.entities;

import org.springframework.data.rest.core.config.Projection;


@Projection(name="ticketProj", types=Ticket.class )
public interface TicketProjection {

	public Long Id();
	public String getnomClient();
	public double getprix();
	public Integer getcodePayement();
	public boolean getReserve();
	public Place getPlace();
	
	

}
