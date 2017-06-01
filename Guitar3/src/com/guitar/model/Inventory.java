
package com.guitar.model;

import java.util.ArrayList;
import java.util.List;

import com.guitar.model.Guitar;
public class Inventory
{
	private List<Guitar> guitars;

	public Inventory()
	{
		guitars = new ArrayList<Guitar>();
	}

	public void addGuitar(Guitar guitar)
	{
		guitars.add(guitar);
	}

	public List<Guitar> searchGuitar()
	{
		return guitars;
	}

	public void delGuitar(String serialNumber)
	{

	}

}
