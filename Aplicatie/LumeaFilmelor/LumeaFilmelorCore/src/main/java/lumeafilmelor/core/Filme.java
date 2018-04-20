package lumeafilmelor.core;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Filme {

	private Integer Id;
	private String Titlu;  
    private String OriginalTitlu;
    private String  Gen;
    private String Durata;
    private String  Limba;
    private String Premiera;
    private String  Regizor;
    private String Actori;
    private Integer An;
    private String  Descriere;
    private String Trailer;
    private String  Imagine;

    /**
     * !!! WARNING: A no argument constructor is required by the XML (de)serializer
     */
    public Filme() {
    }

    /**
     * 
     * @param username
     * @param password
     */
    public Filme( Integer Id, String Titlu, String OriginalTitlu, String  Gen, String Durata, String  Limba, String Premiera, String  Regizor, String Actori, Integer An, String  Descriere, String Trailer, String  Imagine) {
        super();
    	this.Id=Id;
    	this.Titlu=Titlu;  
        this.OriginalTitlu=OriginalTitlu;
        this.Gen=Gen;
        this.Durata=Durata;
        this.Limba=Limba;
        this.Premiera=Premiera;
        this.Regizor=Regizor;
        this.Actori=Actori;
        this.An=An;
        this.Descriere=Descriere;
        this.Trailer=Trailer;
        this.Imagine=Imagine;
    }

   
	public String getTitlu() {
		return Titlu;
	}

	public String getOriginalTitlu() {
		return OriginalTitlu;
	}

	public String getGen() {
		return Gen;
	}

	public String getDurata() {
		return Durata;
	}

	public String getLimba() {
		return Limba;
	}

	public String getPremiera() {
		return Premiera;
	}

	public String getRegizor() {
		return Regizor;
	}

	public String getActori() {
		return Actori;
	}

	public Integer getAn() {
		return An;
	}

	public String getDescriere() {
		return Descriere;
	}

	public String getTrailer() {
		return Trailer;
	}

	public String getImagine() {
		return Imagine;
	}

	public Integer getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Filme [Id=" + Id + ", Titlu=" + Titlu + ", OriginalTitlu=" + OriginalTitlu + ", Gen=" + Gen
				+ ", Durata=" + Durata + ", Limba=" + Limba + ", Premiera=" + Premiera + ", Regizor=" + Regizor
				+ ", Actori=" + Actori + ", An=" + An + ", Descriere=" + Descriere + ", Trailer=" + Trailer
				+ ", Imagine=" + Imagine + "]";
	}

    
    
    
}
