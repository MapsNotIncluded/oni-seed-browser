package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

private val jsonData = """
    [
       {
          "Id":"DLC2_ID",
          "Name":"The Frosty Planet Pack",
          "Description":"<b><i>The Frosty Planet Pack</i></b> features frozen biomes and elements useful in thermal regulation",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC2_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"Content from this DLC is currently <b>disabled</b>"
             },
             {
                "Id":"Enabled",
                "Name":"Enabled",
                "Description":"Content from this DLC is currently <b>enabled</b>\n\nThis includes Care Packages, buildings, and space POIs"
             }
          ]
       },
       {
          "Id":"IceCavesMixing",
          "Name":"Ice Cave Biome",
          "Description":"The Ice Cave Biome's extremely low temperatures make thermal regulation the top priority.",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC2_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This biome will not be mixed into any world"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This biome is very likely to be mixed into a world"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This biome will be mixed into a world, even if it causes a worldgen failure"
             }
          ]
       },
       {
          "Id":"CarrotQuarryMixing",
          "Name":"Cool Pool Biome",
          "Description":"The Cool Pool Biome's chilly landscape features plentiful Ethanol lakes, making it an excellent destination for a colony eager to gather fuel resources.",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC2_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This biome will not be mixed into any world"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This biome is very likely to be mixed into a world"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This biome will be mixed into a world, even if it causes a worldgen failure"
             }
          ]
       },
       {
          "Id":"SugarWoodsMixing",
          "Name":"Nectar Biome",
          "Description":"The snow-laden Nectar Biome is home to the massive Bonbon Tree. This complex plant produces Nectar, which can be refined into Sucrose and Steam.",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC2_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This biome will not be mixed into any world"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This biome is very likely to be mixed into a world"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This biome will be mixed into a world, even if it causes a worldgen failure"
             }
          ]
       },
       {
          "Id":"CeresAsteroidMixing",
          "Name":"Ceres Fragment",
          "Description":"A fragment of a frosty starting world with sub-zero temperatures throughout.\n\n<smallcaps>Duplicants who work in sub-zero temperatures will need to wear or build warming equipment. Abundant natural fuel sources could lead to a well-powered colony.</smallcaps>",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC2_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This asteroid will not be mixed in"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This asteroid is very likely to be mixed in"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This asteroid will be mixed in, even if it causes worldgen failure"
             }
          ]
       },
       {
          "Id":"DLC3_ID",
          "Name":"The Bionic Booster Pack",
          "Description":"<i>The Bionic Booster Pack</i> features portable power storage, bionic Duplicants, and remote building operation",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC3_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"Content from this DLC is currently <b>disabled</b>"
             },
             {
                "Id":"Enabled",
                "Name":"Enabled",
                "Description":"Content from this DLC is currently <b>enabled</b>\n\nThis includes Care Packages, buildings, and space POIs"
             }
          ]
       },
       {
          "Id":"DLC4_ID",
          "Name":"The Prehistoric Planet Pack",
          "Description":"<i>The Prehistoric Planet Pack</i> features carnivorous flora and fauna, biofuel, and a focus on surface defense",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC4_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"Content from this DLC is currently <b>disabled</b>"
             },
             {
                "Id":"Enabled",
                "Name":"Enabled",
                "Description":"Content from this DLC is currently <b>enabled</b>\n\nThis includes Care Packages, buildings, and space POIs"
             }
          ]
       },
       {
          "Id":"GardenMixing",
          "Name":"Garden Biome",
          "Description":"The Garden biome is a temperate environment with beneficial critters and plants well-suited for Farming.",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC4_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This biome will not be mixed into any world"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This biome is very likely to be mixed into a world"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This biome will be mixed into a world, even if it causes a worldgen failure"
             }
          ]
       },
       {
          "Id":"RaptorMixing",
          "Name":"Feather Biome",
          "Description":"The chilly Feather biome is home to huge, flightless Rhexes that can be shorn for Textile Production.",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC4_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This biome will not be mixed into any world"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This biome is very likely to be mixed into a world"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This biome will be mixed into a world, even if it causes a worldgen failure"
             }
          ]
       },
       {
          "Id":"WetlandsMixing",
          "Name":"Wetlands Biome",
          "Description":"This hot, sticky biome features plentiful pools of Polluted Water, as well as raw ingredients useful in establishing industrial systems.",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC4_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This biome will not be mixed into any world"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This biome is very likely to be mixed into a world"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This biome will be mixed into a world, even if it causes a worldgen failure"
             }
          ]
       },
       {
          "Id":"PrehistoricAsteroidMixing",
          "Name":"Relica Fragment",
          "Description":"A fragment of a prehistoric starting world.\n\n<smallcaps>Its biodiversity makes reliable food production more attainable for new colonies. Construction materials and fuels are also ample. </smallcaps>",
          "coordinate_range":5,
          "requiredDlcs":[
             "DLC4_ID"
          ],
          "Levels":[
             {
                "Id":"Disabled",
                "Name":"Disabled",
                "Description":"This asteroid will not be mixed in"
             },
             {
                "Id":"TryMixing",
                "Name":"Likely",
                "Description":"This asteroid is very likely to be mixed in"
             },
             {
                "Id":"GuranteeMixing",
                "Name":"Guaranteed",
                "Description":"This asteroid will be mixed in, even if it causes worldgen failure"
             }
          ]
       }
    ]
""".trimIndent()

@Serializable
data class MixingSetting(

    @SerialName("Id")
    val id: String,

    @SerialName("Name")
    val name: String,

    @SerialName("coordinate_range")
    val coordinateRange: Int,

    @SerialName("Levels")
    val levels: List<MixingLevel>
)

@Serializable
data class MixingLevel(

    @SerialName("Id")
    val id: String
)

val allMixingSettings =
    Json {
        ignoreUnknownKeys = true
    }.decodeFromString<List<MixingSetting>>(jsonData)

