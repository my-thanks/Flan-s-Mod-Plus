package com.flansmod.common.teams;

import java.util.List;
import java.util.HashMap;
import java.util.Iterator;

import net.minecraft.world.World;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.LoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.ForgeChunkManager.Type;

public class ChunkLoadingHandler implements LoadingCallback 
{
	public static ChunkLoadingHandler INSTANCE;
	private HashMap tickets = new HashMap();


	public ChunkLoadingHandler()
	{
		INSTANCE = this;	  
	}

	public void clear()
	{
		tickets = new HashMap();
	}

	public Ticket getTicket(EntityDriveable myDriveableEntity)
	{
		Ticket ticket = (Ticket)tickets.get(myDriveableEntity);
		if(ticket != null)
		{
			return ticket;
		} else
		{
			ticket = ForgeChunkManager.requestTicket(FlansMod.INSTANCE, myDriveableEntity.worldObj, Type.ENTITY);
			ticket.bindEntity(myDriveableEntity);
			ticket.setChunkListDepth(6);
			tickets.put(myDriveableEntity, ticket);
			return null;
		}
	}
		
	@Override
	public void ticketsLoaded(List<Ticket> tickets, World world) 
	{
		for(Ticket ticket : tickets) 
		{
			String s = ticket.getModData().getString("ShortName");
			TeamsMap map = TeamsManager.getInstance().maps.get(s);
			if(ticket != null && map != null)
				map.forceChunkLoading(ticket);
		}
	}

}
