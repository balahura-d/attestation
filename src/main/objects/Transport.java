package main.objects;

public class Transport {
	private int idTransport;
	private int idCity;
	private String transportType;
	private double transportPrice;

	public int getIdTransport() {
		return idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public double getTransportPrice() {
		return transportPrice;
	}

	public void setTransportPrice(double transportPrice) {
		this.transportPrice = transportPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCity;
		result = prime * result + idTransport;
		long temp;
		temp = Double.doubleToLongBits(transportPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transportType == null) ? 0 : transportType.hashCode());
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
		Transport other = (Transport) obj;
		if (idCity != other.idCity)
			return false;
		if (idTransport != other.idTransport)
			return false;
		if (Double.doubleToLongBits(transportPrice) != Double.doubleToLongBits(other.transportPrice))
			return false;
		if (transportType == null) {
			if (other.transportType != null)
				return false;
		} else if (!transportType.equals(other.transportType))
			return false;
		return true;
	}
}
