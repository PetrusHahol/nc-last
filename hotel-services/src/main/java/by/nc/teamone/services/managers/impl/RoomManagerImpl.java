package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IBaseDAO;
import by.nc.teamone.dba.dao.IClaimStatusDAO;
import by.nc.teamone.dba.dao.IRoomDAO;
import by.nc.teamone.dba.dao.IStatusDAO;
import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.entities.ClaimStatus;
import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.managers.IRoomManager;
import by.nc.teamone.services.transformers.RoomModelTransformer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope("singleton")
public class RoomManagerImpl implements IRoomManager {

    @Autowired
    private IRoomDAO roomDAO;

    @Autowired
    private ITypeDAO typeDAO;

    @Autowired
    private IStatusDAO statusDAO;
    
    @Autowired
    private IClaimStatusDAO claimStatusDAO;

    @Autowired
    private RoomModelTransformer roomModelTransformer;

    @Override
    public void addRoom(RoomModel roomModel) {

        Room room = roomModelTransformer.buildEntity(roomModel);
        room.setStatus(statusDAO.get(1L));
        room.setType(typeDAO.get(roomModel.type));
        room.setClaimStatus(claimStatusDAO.get(1L));
        roomDAO.add(room);

    }

	@Override
	public List<Room> getRoomList() {
		List<Room> roomList = roomDAO.getAll();
		return roomList;
	}
}
