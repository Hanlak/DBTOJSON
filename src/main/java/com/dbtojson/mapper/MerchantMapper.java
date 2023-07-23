package com.dbtojson.mapper;
import com.dbtojson.dto.MerchantDto;
import com.dbtojson.entity.Merchant;

public class MerchantMapper {

    public static MerchantDto mapToDto(Merchant merchant) {
        if (merchant == null) {
            return null;
        }

        MerchantDto merchantDto = new MerchantDto();
        merchantDto.setCommand("update"); // You can set a default command value if needed
        merchantDto.setMerchantNumber(merchant.getMerchantNumber());
        merchantDto.setMerchantName(merchant.getMerchantName());
        merchantDto.setMerchantLabel(merchant.getMerchantName()); // Setting the merchant name as the label, adjust accordingly if needed
        merchantDto.setMerchantType(merchant.getMerchantType());
        merchantDto.setMcc(merchant.getMcc()); // Assuming merchant.getMcc() returns a String, so we parse it to an int
        merchantDto.setCurrentAppStatus(merchant.getCurrentAppStatus());
        return merchantDto;
    }
}
