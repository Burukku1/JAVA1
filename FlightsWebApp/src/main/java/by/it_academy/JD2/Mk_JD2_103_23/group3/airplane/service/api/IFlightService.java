package by.it_academy.JD2.Mk_JD2_103_23.group3.airplane.service.api;

import by.it_academy.JD2.Mk_JD2_103_23.group3.airplane.core.dto.Flight;
import by.it_academy.JD2.Mk_JD2_103_23.group3.airplane.core.dto.FlightFilter;
import by.it_academy.JD2.Mk_JD2_103_23.group3.airplane.core.dto.PageSize;


import java.util.List;

public interface IFlightService {


    List<Flight> getFlights(FlightFilter filter, PageSize pageSize);
}
