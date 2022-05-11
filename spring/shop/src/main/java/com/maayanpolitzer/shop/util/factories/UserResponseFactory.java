package com.maayanpolitzer.shop.util.factories;

import com.maayanpolitzer.shop.models.dto.UserDTO;
import com.maayanpolitzer.shop.models.responses.UserDevResponse;
import com.maayanpolitzer.shop.models.responses.UserProdResponse;
import com.maayanpolitzer.shop.models.responses.UserResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class UserResponseFactory {

    public static List<UserResponse> getUserResponse(List<UserDTO> users, ModelMapper modelMapper, String activeProfile){
        switch(activeProfile){
            case "dev":
                return modelMapper.map(users, new TypeToken<List<UserDevResponse>>(){}.getType());
            case "prod":
                return modelMapper.map(users, new TypeToken<List<UserProdResponse>>(){}.getType());
            default:
                // TODO: 08/05/2022 throw an exception
                return null;

        }
    }

}
