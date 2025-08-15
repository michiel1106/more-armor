package com.example;

import com.example.item.CustomArmor;

import com.example.models.ModelBloodedLightningDragonArmor;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = SampleMod112.MODID,
	name = SampleMod112.NAME,
	version = SampleMod112.VERSION
)
public class SampleMod112 {
	public static final String MODID = "bcarmors";
	public static final String NAME = "Better Custom Armor";
	public static final String VERSION = "1.0";


	public static final ModelBloodedLightningDragonArmor ARMOR_MODEL_NO_LEGS = new ModelBloodedLightningDragonArmor(0.5F, false);
	public static final ModelBloodedLightningDragonArmor ARMOR_MODEL_LEGS = new ModelBloodedLightningDragonArmor(0.2F, true);
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);



	public static ItemArmor.ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial("BETTER_ARMOR",
			"bcarmors:textures/models/armor/better_armor",
			800,
			new int[] {7, 10, 13, 7},
			20,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			2.0F);





	public static final Item BETTER_HELMET = new CustomArmor(ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item BETTER_CHESTPLATE = new CustomArmor(ARMOR_MATERIAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item BETTER_LEGGINGS = new CustomArmor(ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item BETTER_BOOTS = new CustomArmor(ARMOR_MATERIAL, 1, EntityEquipmentSlot.FEET);

	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		MinecraftForge.EVENT_BUS.register(this);


    }


	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {

		event.getRegistry().register(BETTER_HELMET.setRegistryName(MODID, "ender_dragon_head_piece").setTranslationKey("ender_dragon_head_piece"));
		event.getRegistry().register(BETTER_CHESTPLATE.setRegistryName(MODID, "rahovart_chest_piece").setTranslationKey("rahovart_chest_piece"));
		event.getRegistry().register(BETTER_LEGGINGS.setRegistryName(MODID, "amalgalich_leggings").setTranslationKey("amalgalich_leggings"));
		event.getRegistry().register(BETTER_BOOTS.setRegistryName(MODID, "asmodeus_boots").setTranslationKey("asmodeus_boots"));

	}


}
