package com.example.item;

import com.example.SampleMod112;
import com.example.models.ModelBloodedLightningDragonArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CustomArmor extends ItemArmor {
    public CustomArmor(ArmorMaterial material, int render, EntityEquipmentSlot equipmentSlot) {
        super(material, render, equipmentSlot);

    }


    @Override
    public boolean isEnchantable(ItemStack itemStack) {
        return true;
    }

    @Nullable
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {


        if (renderIndex == 2) {
            return SampleMod112.ARMOR_MODEL_LEGS;
        } else {
            return SampleMod112.ARMOR_MODEL_NO_LEGS;
        }

    }


    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return "bcarmors:textures/models/armor/" + "armor_black" + (renderIndex == 2 ? "_legs.png" : ".png");
    }




}
