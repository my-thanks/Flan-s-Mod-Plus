package com.flansmod.common.driveables;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.DriveableType;

import java.util.ArrayList;

//public abstract class PassengerController
public class PassengerController
{
	public ArrayList<Entity> passengers; // = new ArrayList<Entity>();
	//public EntityDriveable controllingDriveable;
	public DriveableType controllingDriveableType;

	public PassengerController()
    {
        //controllingDriveable = driveableControl;
		//controllingDriveableType = contrDriveType;
		passengers = new ArrayList<Entity>();
		/*
		for(int i = 0; i < controllingDriveableType.numPassengers + 1; i++)
		{
			passengers.add(null);
		}
		*/
		
	}
	public void setPassengerListCapasity(int howMuchBig)
	{
		passengers.ensureCapacity(howMuchBig);
	}
	public void setHardPassengerToList(Entity passenger)
	{
		passengers.add(passenger);
	}
	
	public void addPassengerToList(Entity passenger, int seatID)
	{
		if(seatID < passengers.size())
			passengers.set(seatID, passenger);
	}
	
	public Entity getPassengerFromList(int seatID)
	{
		if(seatID < passengers.size())
			return passengers.get(seatID);
		else
			return null;
	}
	
	public void removePassengerFromList(int seatID)
	{
		if(seatID < passengers.size())
			passengers.set(seatID, null);
	}
	
	public void clearPassengersList()
	{
		passengers.clear();
	}
	
	public boolean checkPassengerInList(Entity passenger, int seatID)
	{
		if(seatID < passengers.size())
			return passengers.get(seatID) == passenger;
		else
			return false;
	}

}