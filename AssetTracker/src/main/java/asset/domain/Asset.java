package asset.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Asset Class to represent asset 
 * 
 * @author dbuaklee
 *
 */

@Entity
public class Asset implements Serializable{
	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = -6971630677495347897L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false) 
	private String name;
	
}
