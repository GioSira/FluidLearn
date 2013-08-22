package org.fluidlearn.core.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Node implements Serializable {

	private static final long serialVersionUID = -1308795024262635690L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String title;

	@ElementCollection
	private List<Node> father;

	public Node() {
		super();
	}

	public Node(Long id, String title, List<Node> father) {
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

	public List<Node> getFather() {
		return father;
	}

	public void setFather(List<Node> fathers) {
		this.father = fathers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void add(Node son) {
		getNodesInternal().add(son);

	}

	public Node getNode(String title) {
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

	private List<Node> getNodesInternal() {
		if (this.father == null) {
			return this.father = new ArrayList<Node>();
		}
		return this.father;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", title=" + title + ", father=" + father
				+ "]";
	}

}
