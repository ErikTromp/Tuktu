package tuktu.deeplearn.models.image

object util {
    val categoryMap = Map("English_foxhound"->"dog","dugong"->"vertebrate","zebra"->"hoofed_animal","jay"->"bird","oystercatcher"->"bird","magpie"->"bird","cougar"->"cat","gibbon"->"primate","jinrikisha"->"vehicle","little_blue_heron"->"bird","bow"->"weapon","black_stork"->"bird","eel"->"fish","chain_saw"->"object_other","snow_leopard"->"cat","binder"->"covering","jigsaw_puzzle"->"object_other","sweatshirt"->"garment","water_tower"->"object_other","fur_coat"->"garment","radiator"->"object_other","bobsled"->"vehicle","diamondback"->"snake","tricycle"->"vehicle","borzoi"->"dog","maillot"->"covering","gar"->"fish","cannon"->"weapon","totem_pole"->"building","dingo"->"dog","magnetic_compass"->"object_other","orange"->"fruit","hip"->"fruit","dowitcher"->"bird","racket"->"object_other","window_screen"->"covering","liner"->"vehicle","iPod"->"object_other","acoustic_guitar"->"musical_instrument","flat-coated_retriever"->"dog","horned_viper"->"snake","wool"->"cloth","French_loaf"->"food","swab"->"object_other","cricket"->"insect","mobile_home"->"vehicle","purse"->"object_other","mosque"->"building","fountain"->"building","rain_barrel"->"object_other","maraca"->"musical_instrument","lotion"->"object_other","water_jug"->"object_other","cassette_player"->"object_other","great_grey_owl"->"bird","rock_beauty"->"fish","cauliflower"->"vegetable","nipple"->"covering","pomegranate"->"fruit","cucumber"->"vegetable","buckeye"->"fruit","minivan"->"vehicle","Granny_Smith"->"fruit","quill"->"object_other","giant_schnauzer"->"dog","ostrich"->"bird","power_drill"->"object_other","green_mamba"->"snake","tank"->"vehicle","plane"->"object_other","mixing_bowl"->"object_other","ping-pong_ball"->"object_other","trench_coat"->"garment","spatula"->"food","steel_drum"->"musical_instrument","flagpole"->"object_other","Arctic_fox"->"vertebrate","Rhodesian_ridgeback"->"dog","slot"->"object_other","boa_constrictor"->"snake","chain"->"object_other","ibex"->"hoofed_animal","crayfish"->"vertebrate","Christmas_stocking"->"covering","miniature_schnauzer"->"dog","reel"->"object_other","ambulance"->"vehicle","zucchini"->"vegetable","Chihuahua"->"dog","altar"->"building","trombone"->"musical_instrument","Pekinese"->"dog","bow_tie"->"garment","dam"->"building","centipede"->"vertebrate","bolete"->"fungus","velvet"->"cloth","lumbermill"->"building","Border_terrier"->"dog","ringneck_snake"->"snake","jackfruit"->"fruit","vault"->"covering","coffee_mug"->"object_other","carpenter's_kit"->"object_other","necklace"->"object_other","head_cabbage"->"vegetable","thunder_snake"->"snake","stole"->"garment","crane"->"bird","pool_table"->"object_other","coral_reef"->"nature","school_bus"->"vehicle","electric_fan"->"object_other","butternut_squash"->"vegetable","hatchet"->"object_other","scabbard"->"covering","abacus"->"object_other","football_helmet"->"covering","sarong"->"garment","sports_car"->"vehicle","knot"->"object_other","knee_pad"->"garment","plate"->"food","clumber"->"dog","nail"->"object_other","tow_truck"->"vehicle","American_Staffordshire_terrier"->"dog","Mexican_hairless"->"dog","tape_player"->"object_other","red_fox"->"vertebrate","weasel"->"vertebrate","cliff_dwelling"->"building","lighter"->"object_other","Japanese_spaniel"->"dog","toilet_tissue"->"object_other","hippopotamus"->"hoofed_animal","hourglass"->"device","partridge"->"bird","plunger"->"object_other","hand_blower"->"object_other","Great_Dane"->"dog","fire_engine"->"vehicle","television"->"object_other","library"->"building","brassiere"->"garment","notebook"->"object_other","maillot"->"garment","malinois"->"dog","dragonfly"->"insect","ant"->"insect","jersey"->"garment","shoe_shop"->"building","planetarium"->"building","French_horn"->"musical_instrument","spider_web"->"object_other","bagel"->"food","Loafer"->"covering","Blenheim_spaniel"->"dog","lynx"->"cat","forklift"->"vehicle","hoopskirt"->"garment","valley"->"nature","sewing_machine"->"object_other","groom"->"human","Labrador_retriever"->"dog","kimono"->"garment","cornet"->"musical_instrument","Maltese_dog"->"dog","bell_pepper"->"vegetable","Greater_Swiss_Mountain_dog"->"dog","parachute"->"object_other","armadillo"->"vertebrate","printer"->"object_other","walking_stick"->"insect","clog"->"covering","matchstick"->"object_other","punching_bag"->"object_other","tiger"->"cat","snowmobile"->"vehicle","goldfish"->"fish","coral_fungus"->"fungus","oboe"->"musical_instrument","rifle"->"weapon","Saluki"->"dog","bottlecap"->"covering","drilling_platform"->"object_other","soap_dispenser"->"object_other","bison"->"hoofed_animal","trimaran"->"vehicle","plate_rack"->"building","papillon"->"dog","snail"->"fish","piggy_bank"->"object_other","Shih-Tzu"->"dog","hen-of-the-woods"->"fungus","racer"->"vehicle","vulture"->"bird","sax"->"musical_instrument","hen"->"bird","feather_boa"->"garment","pizza"->"food","breakwater"->"building","Brabancon_griffon"->"dog","gazelle"->"hoofed_animal","acorn"->"fruit","sunscreen"->"object_other","seashore"->"nature","redshank"->"bird","Welsh_springer_spaniel"->"dog","flamingo"->"bird","soft-coated_wheaten_terrier"->"dog","admiral"->"insect","desk"->"object_other","isopod"->"vertebrate","greenhouse"->"building","toy_terrier"->"dog","rocking_chair"->"object_other","meerkat"->"vertebrate","menu"->"food","odometer"->"device","orangutan"->"primate","screwdriver"->"object_other","dishwasher"->"building","binoculars"->"object_other","pencil_box"->"object_other","dung_beetle"->"insect","gorilla"->"primate","electric_ray"->"fish","space_shuttle"->"vehicle","triumphal_arch"->"building","hammer"->"object_other","ocarina"->"musical_instrument","police_van"->"vehicle","wombat"->"vertebrate","medicine_chest"->"object_other","vending_machine"->"object_other","marmot"->"vertebrate","mongoose"->"vertebrate","curly-coated_retriever"->"dog","komondor"->"dog","wig"->"covering","pot"->"object_other","paintbrush"->"object_other","combination_lock"->"object_other","Kerry_blue_terrier"->"dog","great_white_shark"->"fish","mailbox"->"object_other","loggerhead"->"vertebrate","loudspeaker"->"device","waffle_iron"->"building","sloth_bear"->"vertebrate","palace"->"building","baseball"->"object_other","English_springer"->"dog","fig"->"fruit","whistle"->"object_other","acorn_squash"->"vegetable","buckle"->"object_other","harp"->"musical_instrument","freight_car"->"vehicle","Airedale"->"dog","whippet"->"dog","spotlight"->"object_other","bicycle-built-for-two"->"vehicle","Irish_terrier"->"dog","daisy"->"nature","leafhopper"->"insect","fireboat"->"vehicle","bookcase"->"object_other","tractor"->"vehicle","hermit_crab"->"vertebrate","cock"->"bird","tailed_frog"->"vertebrate","toy_poodle"->"dog","spaghetti_squash"->"vegetable","killer_whale"->"vertebrate","cliff"->"nature","monastery"->"building","baboon"->"primate","spiny_lobster"->"vertebrate","car_wheel"->"object_other","stone_wall"->"building","balloon"->"vehicle","toyshop"->"building","harvester"->"object_other","black-and-tan_coonhound"->"dog","handkerchief"->"cloth","Komodo_dragon"->"vertebrate","Newfoundland"->"dog","saltshaker"->"object_other","hog"->"hoofed_animal","slug"->"fish","sleeping_bag"->"object_other","recreational_vehicle"->"vehicle","pelican"->"bird","ram"->"hoofed_animal","sea_slug"->"fish","banana"->"fruit","cardoon"->"vegetable","ear"->"fruit","chambered_nautilus"->"fish","bulletproof_vest"->"cat","lesser_panda"->"vertebrate","basenji"->"dog","lifeboat"->"vehicle","kite"->"bird","ladle"->"object_other","red-breasted_merganser"->"bird","web_site"->"object_other","fox_squirrel"->"vertebrate","cardigan"->"garment","pajama"->"covering","common_iguana"->"vertebrate","parallel_bars"->"object_other","ballpoint"->"object_other","mountain_bike"->"vehicle","starfish"->"vertebrate","ladybug"->"insect","hair_spray"->"object_other","washer"->"building","gondola"->"vehicle","scorpion"->"vertebrate","running_shoe"->"covering","standard_poodle"->"dog","keeshond"->"dog","titi"->"primate","strawberry"->"fruit","trailer_truck"->"vehicle","syringe"->"device","puffer"->"fish","half_track"->"vehicle","moped"->"vehicle","shopping_basket"->"object_other","toilet_seat"->"object_other","tub"->"object_other","speedboat"->"vehicle","Border_collie"->"dog","window_shade"->"covering","crane"->"object_other","backpack"->"object_other","cabbage_butterfly"->"insect","lionfish"->"fish","swing"->"object_other","thatch"->"covering","West_Highland_white_terrier"->"dog","water_buffalo"->"hoofed_animal","king_penguin"->"bird","chimpanzee"->"primate","carousel"->"object_other","American_lobster"->"vertebrate","EntleBucher"->"dog","chime"->"musical_instrument","bee"->"insect","refrigerator"->"building","golden_retriever"->"dog","accordion"->"musical_instrument","quail"->"bird","common_newt"->"vertebrate","Gordon_setter"->"dog","cab"->"vehicle","overskirt"->"garment","photocopier"->"object_other","scale"->"device","Dutch_oven"->"building","cup"->"food","bald_eagle"->"bird","potpie"->"food","American_black_bear"->"vertebrate","cuirass"->"cat","trolleybus"->"vehicle","red-backed_sandpiper"->"bird","promontory"->"nature","Great_Pyrenees"->"dog","vacuum"->"building","sea_snake"->"snake","safe"->"object_other","shield"->"covering","file"->"object_other","chest"->"object_other","wild_boar"->"hoofed_animal","ptarmigan"->"bird","monarch"->"insect","pedestal"->"building","tiger_shark"->"fish","cowboy_boot"->"covering","Scottish_deerhound"->"dog","echidna"->"vertebrate","American_chameleon"->"vertebrate","tiger_beetle"->"insect","cradle"->"object_other","Australian_terrier"->"dog","red_wolf"->"vertebrate","mink"->"vertebrate","brass"->"building","water_bottle"->"object_other","gown"->"covering","ox"->"hoofed_animal","street_sign"->"object_other","crash_helmet"->"covering","rule"->"device","warplane"->"vehicle","English_setter"->"dog","shoji"->"covering","prayer_rug"->"vehicle","Irish_setter"->"dog","ice_lolly"->"food","switch"->"object_other","honeycomb"->"building","sea_cucumber"->"vertebrate","Yorkshire_terrier"->"dog","beer_glass"->"object_other","spindle"->"object_other","go-kart"->"vehicle","boxer"->"dog","axolotl"->"vertebrate","upright"->"musical_instrument","bluetick"->"dog","soccer_ball"->"object_other","ice_cream"->"food","balance_beam"->"object_other","limousine"->"vehicle","eft"->"vertebrate","garden_spider"->"vertebrate","ruffed_grouse"->"bird","espresso"->"food","Model_T"->"vehicle","alp"->"nature","bucket"->"object_other","pirate"->"vehicle","reflex_camera"->"object_other","nematode"->"vertebrate","pretzel"->"food","birdhouse"->"covering","umbrella"->"covering","stage"->"object_other","bonnet"->"covering","dishrag"->"cloth","flatworm"->"vertebrate","Bouvier_des_Flandres"->"dog","indri"->"primate","whiskey_jug"->"object_other","king_crab"->"vertebrate","Lhasa"->"dog","poncho"->"garment","Staffordshire_bullterrier"->"dog","beer_bottle"->"object_other","long-horned_beetle"->"insect","shopping_cart"->"vehicle","cairn"->"dog","geyser"->"nature","cowboy_hat"->"covering","Rottweiler"->"dog","mountain_tent"->"building","brain_coral"->"vertebrate","plow"->"object_other","lemon"->"fruit","American_alligator"->"vertebrate","grasshopper"->"insect","ski_mask"->"covering","oxcart"->"vehicle","tusker"->"vertebrate","kelpie"->"dog","miniature_pinscher"->"dog","sturgeon"->"fish","moving_van"->"vehicle","barrow"->"vehicle","iron"->"building","beach_wagon"->"vehicle","electric_locomotive"->"vehicle","mask"->"covering","marimba"->"musical_instrument","kit_fox"->"vertebrate","sulphur-crested_cockatoo"->"bird","restaurant"->"building","wall_clock"->"device","Samoyed"->"dog","Indian_cobra"->"snake","jack-o'-lantern"->"object_other","torch"->"object_other","candle"->"object_other","shovel"->"object_other","barn_spider"->"vertebrate","impala"->"hoofed_animal","stove"->"object_other","sea_lion"->"vertebrate","stinkhorn"->"fungus","volleyball"->"object_other","proboscis_monkey"->"primate","Norwegian_elkhound"->"dog","hognose_snake"->"snake","silky_terrier"->"dog","rock_python"->"snake","Lakeland_terrier"->"dog","bassoon"->"musical_instrument","Petri_dish"->"object_other","rock_crab"->"vertebrate","pineapple"->"fruit","fly"->"insect","cleaver"->"object_other","kuvasz"->"dog","ballplayer"->"human","miniskirt"->"garment","brown_bear"->"vertebrate","snorkel"->"object_other","bakery"->"building","German_shepherd"->"dog","apiary"->"building","muzzle"->"object_other","chickadee"->"bird","dumbbell"->"object_other","black-footed_ferret"->"vertebrate","crate"->"object_other","abaya"->"garment","jeep"->"vehicle","wardrobe"->"object_other","barbell"->"object_other","oil_filter"->"object_other","mud_turtle"->"vertebrate","ski"->"object_other","carbonara"->"food","cellular_telephone"->"object_other","whiptail"->"vertebrate","patio"->"building","water_ouzel"->"bird","safety_pin"->"object_other","giant_panda"->"vertebrate","perfume"->"object_other","electric_guitar"->"musical_instrument","vine_snake"->"snake","barn"->"building","airliner"->"vehicle","aircraft_carrier"->"vehicle","sea_anemone"->"vertebrate","hamster"->"vertebrate","coil"->"building","pay-phone"->"object_other","picket_fence"->"building","crib"->"object_other","broom"->"object_other","lorikeet"->"bird","apron"->"garment","stopwatch"->"device","cockroach"->"insect","academic_gown"->"covering","monitor"->"object_other","washbasin"->"object_other","bulbul"->"bird","volcano"->"nature","spotted_salamander"->"vertebrate","hamper"->"object_other","tennis_ball"->"object_other","Windsor_tie"->"garment","table_lamp"->"object_other","wallaby"->"vertebrate","toaster"->"building","digital_clock"->"device","stupa"->"building","tabby"->"cat","howler_monkey"->"primate","bath_towel"->"building","Gila_monster"->"vertebrate","coyote"->"vertebrate","French_bulldog"->"dog","timber_wolf"->"vertebrate","Weimaraner"->"dog","hotdog"->"food","Irish_wolfhound"->"dog","pinwheel"->"object_other","sidewinder"->"snake","mortar"->"object_other","harmonica"->"musical_instrument","cash_machine"->"object_other","horizontal_bar"->"object_other","consomme"->"food","Siberian_husky"->"dog","pillow"->"cloth","coffeepot"->"object_other","corn"->"vehicle","fountain_pen"->"object_other","can_opener"->"object_other","crossword_puzzle"->"object_other","bighorn"->"hoofed_animal","panpipe"->"musical_instrument","Dandie_Dinmont"->"dog","cocker_spaniel"->"dog","hartebeest"->"hoofed_animal","Brittany_spaniel"->"dog","corkscrew"->"object_other","Shetland_sheepdog"->"dog","Pomeranian"->"dog","guacamole"->"food","hand-held_computer"->"object_other","Appenzeller"->"dog","Leonberg"->"dog","yurt"->"building","military_uniform"->"covering","tripod"->"object_other","airship"->"vehicle","Angora"->"vertebrate","siamang"->"primate","drumstick"->"object_other","stethoscope"->"device","pole"->"object_other","agaric"->"fungus","home_theater"->"building","seat_belt"->"object_other","house_finch"->"bird","brambling"->"bird","letter_opener"->"object_other","hornbill"->"bird","hot_pot"->"food","green_lizard"->"vertebrate","holster"->"covering","hammerhead"->"fish","robin"->"bird","throne"->"object_other","grille"->"building","basketball"->"object_other","ice_bear"->"vertebrate","macaw"->"bird","warthog"->"hoofed_animal","golfcart"->"vehicle","black_swan"->"bird","pickelhaube"->"covering","tree_frog"->"vertebrate","typewriter_keyboard"->"object_other","custard_apple"->"fruit","barber_chair"->"object_other","car_mirror"->"object_other","German_short-haired_pointer"->"dog","Norwich_terrier"->"dog","plastic_bag"->"object_other","African_crocodile"->"vertebrate","otter"->"vertebrate","space_heater"->"object_other","hummingbird"->"bird","confectionery"->"building","king_snake"->"snake","cicada"->"insect","neck_brace"->"object_other","eggnog"->"food","quilt"->"covering","box_turtle"->"vertebrate","missile"->"vehicle","jaguar"->"cat","cassette"->"object_other","scuba_diver"->"human","trifle"->"food","spoonbill"->"bird","caldron"->"object_other","space_bar"->"object_other","Ibizan_hound"->"dog","radio_telescope"->"object_other","malamute"->"dog","collie"->"dog","bell_cote"->"covering","goblet"->"object_other","frilled_lizard"->"vertebrate","broccoli"->"vegetable","snowplow"->"vehicle","milk_can"->"object_other","sulphur_butterfly"->"insect","bullet_train"->"object_other","hare"->"vertebrate","laptop"->"object_other","weevil"->"insect","unicycle"->"vehicle","church"->"building","jellyfish"->"vertebrate","ashcan"->"object_other","horse_cart"->"vehicle","grey_whale"->"vertebrate","rugby_ball"->"object_other","limpkin"->"bird","alligator_lizard"->"vertebrate","pill_bottle"->"object_other","guillotine"->"object_other","goldfinch"->"bird","wood_rabbit"->"vertebrate","stretcher"->"object_other","bloodhound"->"dog","pick"->"object_other","mashed_potato"->"food","night_snake"->"snake","swimming_trunks"->"garment","Egyptian_cat"->"cat","dock"->"building","beagle"->"dog","Bernese_mountain_dog"->"dog","sea_urchin"->"vertebrate","vizsla"->"dog","mouse"->"device","minibus"->"vehicle","triceratops"->"vertebrate","wreck"->"vehicle","Polaroid_camera"->"object_other","briard"->"dog","drake"->"bird","prairie_chicken"->"bird","Norfolk_terrier"->"dog","anemone_fish"->"fish","porcupine"->"vertebrate","American_coot"->"bird","European_gallinule"->"bird","damselfly"->"insect","motor_scooter"->"vehicle","bookshop"->"building","lens_cap"->"covering","streetcar"->"vehicle","viaduct"->"building","bannister"->"building","pop_bottle"->"object_other","peacock"->"bird","Cardigan"->"dog","langur"->"primate","steam_locomotive"->"vehicle","container_ship"->"vehicle","soup_bowl"->"object_other","barrel"->"object_other","white_stork"->"bird","sandbar"->"nature","suspension_bridge"->"building","pickup"->"vehicle","scoreboard"->"building","CD_player"->"object_other","studio_couch"->"object_other","sundial"->"device","platypus"->"vertebrate","terrapin"->"vertebrate","manhole_cover"->"covering","Persian_cat"->"cat","lakeside"->"nature","African_hunting_dog"->"dog","bee_eater"->"bird","Band_Aid"->"covering","breastplate"->"covering","wok"->"object_other","grey_fox"->"vertebrate","folding_chair"->"object_other","white_wolf"->"vertebrate","pug"->"dog","leaf_beetle"->"insect","screen"->"device","bathtub"->"object_other","schipperke"->"dog","European_fire_salamander"->"vertebrate","computer_keyboard"->"object_other","turnstile"->"building","Chesapeake_Bay_retriever"->"dog","bearskin"->"covering","sorrel"->"hoofed_animal","steel_arch_bridge"->"building","butcher_shop"->"building","polecat"->"vertebrate","lampshade"->"covering","Bedlington_terrier"->"dog","tarantula"->"vertebrate","colobus"->"primate","cello"->"musical_instrument","packet"->"object_other","tile_roof"->"covering","microwave"->"building","hook"->"object_other","yawl"->"vehicle","standard_schnauzer"->"dog","convertible"->"vehicle","patas"->"primate","sliding_door"->"building","analog_clock"->"device","desktop_computer"->"object_other","gasmask"->"covering","dalmatian"->"dog","beaker"->"object_other","hair_slide"->"object_other","mousetrap"->"object_other","lacewing"->"insect","dial_telephone"->"object_other","Siamese_cat"->"cat","Doberman"->"dog","bullfrog"->"vertebrate","meat_loaf"->"food","lycaenid"->"insect","Pembroke"->"dog","mailbag"->"object_other","banded_gecko"->"vertebrate","espresso_maker"->"building","thimble"->"object_other","potter's_wheel"->"object_other","paper_towel"->"cloth","cocktail_shaker"->"object_other","barracouta"->"fish","albatross"->"bird","Dungeness_crab"->"vertebrate","miniature_poodle"->"dog","cheetah"->"cat","cheeseburger"->"food","sock"->"covering","leatherback_turtle"->"vertebrate","violin"->"musical_instrument","projector"->"object_other","Tibetan_terrier"->"dog","lipstick"->"object_other","megalith"->"building","Old_English_sheepdog"->"dog","bathing_cap"->"covering","jean"->"garment","wooden_spoon"->"object_other","Saint_Bernard"->"dog","maze"->"object_other","organ"->"musical_instrument","book_jacket"->"covering","chainlink_fence"->"building","fire_screen"->"covering","ruddy_turnstone"->"bird","croquet_ball"->"object_other","earthstar"->"fungus","cloak"->"covering","disk_brake"->"object_other","hard_disc"->"object_other","dogsled"->"vehicle","macaque"->"primate","conch"->"fish","teddy"->"object_other","tick"->"vertebrate","African_elephant"->"vertebrate","coucal"->"bird","African_grey"->"bird","microphone"->"device","rapeseed"->"fruit","crutch"->"object_other","tray"->"object_other","rhinoceros_beetle"->"insect","black_and_gold_garden_spider"->"vertebrate","carton"->"object_other","oscilloscope"->"object_other","park_bench"->"object_other","guinea_pig"->"vertebrate","schooner"->"vehicle","Indian_elephant"->"vertebrate","gas_pump"->"object_other","sombrero"->"covering","red_wine"->"food","shower_curtain"->"object_other","trilobite"->"vertebrate","parking_meter"->"device","suit"->"garment","sunglass"->"object_other","hyena"->"vertebrate","African_chameleon"->"vertebrate","squirrel_monkey"->"primate","assault_rifle"->"weapon","wolf_spider"->"vertebrate","black_grouse"->"bird","fiddler_crab"->"vertebrate","green_snake"->"snake","diaper"->"garment","pier"->"object_other","affenpinscher"->"dog","Boston_bull"->"dog","rubber_eraser"->"object_other","digital_watch"->"device","chow"->"dog","pitcher"->"object_other","frying_pan"->"object_other","ground_beetle"->"insect","dome"->"covering","Eskimo_dog"->"dog","prison"->"building","stingray"->"fish","traffic_light"->"object_other","llama"->"hoofed_animal","Sealyham_terrier"->"dog","artichoke"->"vegetable","puck"->"object_other","china_cabinet"->"object_other","water_snake"->"snake","golf_ball"->"object_other","bull_mastiff"->"dog","sandal"->"covering","harvestman"->"vertebrate","wine_bottle"->"object_other","garter_snake"->"snake","wire-haired_fox_terrier"->"dog","remote_control"->"object_other","groenendael"->"dog","loupe"->"object_other","paddlewheel"->"object_other","toucan"->"bird","theater_curtain"->"object_other","redbone"->"dog","mitten"->"covering","black_widow"->"vertebrate","teapot"->"object_other","lawn_mower"->"object_other","mantis"->"insect","vase"->"object_other","lion"->"cat","Sussex_spaniel"->"dog","tobacco_shop"->"building","obelisk"->"building","American_egret"->"bird","three-toed_sloth"->"vertebrate","hay"->"food","junco"->"bird","projectile"->"weapon","dhole"->"dog","strainer"->"object_other","barometer"->"device","badger"->"vertebrate","coho"->"fish","radio"->"object_other","beacon"->"building","indigo_bunting"->"bird","Walker_hound"->"dog","grocery_store"->"building","mortarboard"->"covering","chiton"->"fish","sunglasses"->"object_other","koala"->"vertebrate","flute"->"musical_instrument","face_powder"->"object_other","amphibian"->"vehicle","skunk"->"vertebrate","doormat"->"covering","passenger_car"->"vehicle","barbershop"->"building","yellow_lady's_slipper"->"flower","spider_monkey"->"primate","bolo_tie"->"garment","maypole"->"object_other","mosquito_net"->"covering","chiffonier"->"object_other","gyromitra"->"fungus","envelope"->"object_other","grand_piano"->"musical_instrument","worm_fence"->"building","bustard"->"bird","rotisserie"->"building","cinema"->"building","modem"->"object_other","bittern"->"bird","tench"->"fish","wing"->"object_other","four-poster"->"object_other","boathouse"->"building","gong"->"musical_instrument","jacamar"->"bird","guenon"->"primate","dough"->"food","paddle"->"object_other","drum"->"musical_instrument","mushroom"->"vegetable","slide_rule"->"object_other","Madagascar_cat"->"primate","Italian_greyhound"->"dog","Irish_water_spaniel"->"dog","tiger_cat"->"cat","marmoset"->"primate","leopard"->"cat","comic_book"->"object_other","catamaran"->"vehicle","ringlet"->"insect","capuchin"->"primate","wallet"->"object_other","beaver"->"vertebrate","padlock"->"object_other","screw"->"object_other","bubble"->"object_other","measuring_cup"->"object_other","lab_coat"->"garment","burrito"->"food","revolver"->"weapon","basset"->"dog","banjo"->"musical_instrument","Scotch_terrier"->"dog","vestment"->"covering","garbage_truck"->"vehicle","chocolate_sauce"->"food","canoe"->"vehicle","bassinet"->"object_other","entertainment_center"->"object_other","Tibetan_mastiff"->"dog","oxygen_mask"->"object_other","bikini"->"garment","chain_mail"->"cat","agama"->"vertebrate","submarine"->"vehicle","Crock_Pot"->"object_other","goose"->"bird","shower_cap"->"covering","Afghan_hound"->"dog","solar_dish"->"object_other","pencil_sharpener"->"object_other","Arabian_camel"->"hoofed_animal","castle"->"building","otterhound"->"dog","joystick"->"object_other","bib"->"cloth","thresher"->"object_other","dining_table"->"object_other")
}