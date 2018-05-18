package main.objects;

public class Tours {
	private int idTour;
	private String tourName;
	private double tourPrice;
	private int idRole;

	public int getIdTour() {
		return idTour;
	}

	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public double getTourPrice() {
		return tourPrice;
	}

	public void setTourPrice(double tourPrice) {
		this.tourPrice = tourPrice;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRole;
		result = prime * result + idTour;
		result = prime * result + ((tourName == null) ? 0 : tourName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(tourPrice);
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
		Tours other = (Tours) obj;
		if (idRole != other.idRole)
			return false;
		if (idTour != other.idTour)
			return false;
		if (tourName == null) {
			if (other.tourName != null)
				return false;
		} else if (!tourName.equals(other.tourName))
			return false;
		if (Double.doubleToLongBits(tourPrice) != Double.doubleToLongBits(other.tourPrice))
			return false;
		return true;
	}
}
