package main.objects;

public class Hotels {
	private int idHotels;
	private int idCity;
	private String hotelName;
	private double roomsPrise;
	
	public Hotels() {
	}

	public int getIdHotels() {
		return idHotels;
	}

	public void setIdHotels(int idHotels) {
		this.idHotels = idHotels;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRoomsPrise() {
		return roomsPrise;
	}

	public void setRoomsPrise(double roomsPrise) {
		this.roomsPrise = roomsPrise;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + idCity;
		result = prime * result + idHotels;
		long temp;
		temp = Double.doubleToLongBits(roomsPrise);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotels other = (Hotels) obj;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (idCity != other.idCity)
			return false;
		if (idHotels != other.idHotels)
			return false;
		if (Double.doubleToLongBits(roomsPrise) != Double.doubleToLongBits(other.roomsPrise))
			return false;
		return true;
	}

}
