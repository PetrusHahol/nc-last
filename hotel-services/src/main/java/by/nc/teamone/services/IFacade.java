package by.nc.teamone.services;

import by.nc.teamone.entities.Equipment;
import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.AddressModel;
import by.nc.teamone.entities.models.UserClaimModel;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.entities.models.UserModel;

import java.util.List;

public interface IFacade {

    void addUser(UserModel userModel);
    User getUserByName(String name);
    User getUserById(Long id);
    List<UserModel> getAllUsers();
    
    void addRoom(RoomModel roomModel);
    List<Room> getRoomList();
    
    void addClaim(UserClaimModel claimModel);
    List<UserClaimModel> getClaimByIdUser(Long id);

    List<Type> getAllType();
    List<Equipment> getAllEquipment();

    List<AddressModel> getAllAddress();
}

