package satisfyu.vinery.util.boat.impl;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import satisfyu.vinery.Vinery;
import satisfyu.vinery.VineryExpectPlatform;
import satisfyu.vinery.util.boat.api.TerraformBoatType;
import satisfyu.vinery.util.boat.api.TerraformBoatTypeRegistry;

import java.util.Optional;

public final class TerraformBoatTrackedData {
	private TerraformBoatTrackedData() {
		return;
	}

	public static final EntityDataSerializer<Optional<TerraformBoatType>> HANDLER = EntityDataSerializer.optional(TerraformBoatTrackedData::write, TerraformBoatTrackedData::read);

	private static void write(FriendlyByteBuf buf, TerraformBoatType boat) {
		buf.writeResourceLocation(VineryExpectPlatform.getId(boat));
	}

	private static TerraformBoatType read(FriendlyByteBuf buf) {
		return VineryExpectPlatform.get(buf.readResourceLocation());
	}

	public static void register() {
		EntityDataSerializers.registerSerializer(HANDLER);
	}
}