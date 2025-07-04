/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de/oni-seed-browser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.logo_frosty_planet_banner
import io.github.stefanoltmann.app.generated.resources.logo_oni
import io.github.stefanoltmann.app.generated.resources.logo_prehistoric_planet_banner
import io.github.stefanoltmann.app.generated.resources.logo_spaced_out
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource

@Suppress("UNUSED")
@Serializable
enum class Dlc(
    val displayName: String,
    val isMainVersion: Boolean,
    val icon: DrawableResource
) {
    BaseGame("Base Game", true, Res.drawable.logo_oni),
    SpacedOut("Spaced Out", true, Res.drawable.logo_spaced_out),
    FrostyPlanet("Frosty Planet", false, Res.drawable.logo_frosty_planet_banner),
    BionicBooster("Bionic Booster", false, Res.drawable.logo_frosty_planet_banner),
    PrehistoricPlanet("Prehistoric Planet", false, Res.drawable.logo_prehistoric_planet_banner);

    companion object {

        val selectableDlcs = listOf(FrostyPlanet, PrehistoricPlanet)
    }
}
