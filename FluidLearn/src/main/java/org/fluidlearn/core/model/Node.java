package org.fluidlearn.core.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Node implements Serializable {

	private static final long serialVersionUID = -1308795024262635690L;


	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private Node father;
	//private List<Node> sons;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((father == null) ? 0 : father.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Node other = (Node) obj;
		if (father == null) {
			if (other.father != null)
				return false;
		} else if (!father.equals(other.father))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public Node() {
		super();
	}

	public Node(Long id, String title, Node father) {
		super();
		this.id = id;
		this.title = title;
		this.father = father;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node fathers) {
		this.father = fathers;
	}

	/*public void add(Node son) {
		getNodesInternal().add(son);

	}*/

	/*public Node getNode(String title) {
		return getNode(title, false);
	}

	public Node getNode(String name, boolean ignoreNew) {
		name = name.toLowerCase();
		for (Node n : getNodesInternal()) {

			String compName = n.getTitle();
			compName = compName.toLowerCase();
			if (compName.equals(name)) {
				return n;
			}

		}
		return null;
	} 

	private Node getNodesInternal() {
		if (this.father == null) {
			return this.father = new Node();
		}
		return this.father;
	} */

	@Override
	public String toString() {
		return "Node [id=" + id + ", title=" + title + ", father=" + father
				+ "]";
	}

}
