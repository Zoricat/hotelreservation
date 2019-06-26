package com.hotelreservation.hotelreservation;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HotelSearchTest {

    @Test
    public void testHotelSearch () {
        HotelSearchEngine searchAllHotels = new HotelSearchEngine ();
        //String[] hotelNames=searchAllHotels.findAll ();
        List<String> hotelNames = searchAllHotels.findAll ();


        assertEquals(hotelNames.size (), 3);

    }
}
