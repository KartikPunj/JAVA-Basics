package controllers;

import Services.TicketService;
import controllers.DTO.IssueTicketRequest;
import controllers.DTO.IssueTicketResponse;
import controllers.DTO.ResponseStatus;
import models.Ticket;

public class TicketController {
        private TicketService ticketService;
// Constructor
        public TicketController(TicketService ticketService){
            this.ticketService = ticketService;
        }

    public TicketService getTicketService() {
        return ticketService;
    }

    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }
// Method
    public IssueTicketResponse issueTicket(IssueTicketRequest issueTicketRequest){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket ticket = ticketService.issueTicket(issueTicketRequest.getVehicleNumber(),
                    issueTicketRequest.getVehicleOwner(),issueTicketRequest.getVehicleTypes(), issueTicketRequest.getGateId()
            );
            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
