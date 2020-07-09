package fr.isika.microservice_boutique.model;

public class Vetements {
	
	private int id;
	
	private String url;
	
	private String logo;
	
	private String titre;
	
	private String prix;

	public Vetements() {
		// TODO Auto-generated constructor stub
	}

	public Vetements(int id, String url, String logo, String titre, String prix) {
		super();
		this.id = id;
		this.url = url;
		this.logo = logo;
		this.titre = titre;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Vetements [id=" + id + ", url=" + url + ", logo=" + logo + ", titre=" + titre + ", prix=" + prix + "]";
	}
}
