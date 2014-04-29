package asset.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Brand Class to represent Brand i.e., HP, IBM, Dell etc 
 * 
 * @author dbuaklee
 *
 */

@Entity
public class Brand implements Serializable{
	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = 5371665096912015976L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false) 
	private String name;
	
}
