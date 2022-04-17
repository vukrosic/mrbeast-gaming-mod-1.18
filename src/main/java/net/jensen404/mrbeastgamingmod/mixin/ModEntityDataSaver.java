package net.jensen404.mrbeastgamingmod.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*
@Mixin(Entity.class)
public class ModEntityDataSaver {
    private NbtCompound persistantData;

    @Inject(method = "writeNbt", at = @At("Head"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable info)
    {
        if(persistantData != null)
        {
            nbt.put("mrbeastgamingmod.kaupen_mod", persistantData)
        }
    }
}*/
