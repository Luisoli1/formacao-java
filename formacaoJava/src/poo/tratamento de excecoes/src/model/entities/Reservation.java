package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
    if (!checkOut.after(checkIn)) {
        throw new DomainException("Error in reservation: Check-out date must be after check-in date");
    }
        this.setRoomNumber(roomNumber);
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getChecOut() {
        return checkOut;
    }
    private void setCheckOut(Date checkOut){
        this.checkOut = checkOut;
    }
    private void setCheckIn(Date checkIn){
        this.checkIn = checkIn;
    }
    public long duration(){
       long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update most be future dates");
        }if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
    }
    @Override
    public String toString(){
        return "Room "
                + getRoomNumber()
                + ", check-in: "
                + sdf.format(checkIn)
                +", check-out:"
                + sdf.format(checkOut)
                +", "
                +duration()
                +" nigths";
    }

}
