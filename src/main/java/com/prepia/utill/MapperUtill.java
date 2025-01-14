package com.prepia.utill;

import com.prepia.domain.Admin;
import com.prepia.domain.JoytelProduct;
import com.prepia.domain.SftpData;
import com.prepia.dto.AdminDto;
import com.prepia.dto.JoytelProductDto;
import com.prepia.dto.SftpDataDto;
import org.modelmapper.ModelMapper;

public class MapperUtill {
    private static final ModelMapper modelMapper = new ModelMapper();

    // JoytelProduct -> JoytelProductDto
    public static JoytelProductDto toDto(JoytelProduct joytelProduct) {
        return modelMapper.map(joytelProduct, JoytelProductDto.class);
    }

    // JoytelProductDto -> JoytelProduct
    public static JoytelProduct toDomain(JoytelProductDto joytelProductDto) {
        return modelMapper.map(joytelProductDto, JoytelProduct.class);
    }

    public static AdminDto toDto(Admin admin) {
        return modelMapper.map(admin, AdminDto.class);
    }

    public static Admin toDomain(AdminDto adminDto) {
        return modelMapper.map(adminDto, Admin.class);
    }

    public static SftpDataDto toDto(SftpData sftpData) {
        return modelMapper.map(sftpData, SftpDataDto.class);
    }

    public static SftpData toDomain(SftpDataDto sftpDataDto) {
        return modelMapper.map(sftpDataDto, SftpData.class);
    }
}
