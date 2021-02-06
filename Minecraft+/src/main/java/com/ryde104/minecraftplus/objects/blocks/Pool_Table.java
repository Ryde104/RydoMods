package com.ryde104.minecraftplus.objects.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class Pool_Table extends Block {

	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(20.6501174187226, 14.31835029669537, -16, 21.638407827333626, 16.04785851176467, 31.99999811498564),
			Block.makeCuboidShape(13.535616109285591, 2.2313271950196976, 24.37868524725321, 16.844687187168613, 12.780675751729, 27.68775821015059),
			Block.makeCuboidShape(14.257729766462036, -0.0595590315220349, 25.063767326080033, 18.188918259768883, 3.555710008919652, 28.994959118162008),
			Block.makeCuboidShape(13.271635399580042, 8.380633763034139, 24.10402357493209, 17.82432632237586, 13.732351170163899, 28.65671591148868),
			Block.makeCuboidShape(19.058509314150484, 13.588833127807861, -11.744612128253078, 21.529235335678056, 16.059559031522035, 6.764636046729034),
			Block.makeCuboidShape(-1.5193272289499564, 13.58883324562126, 29.436186314348056, 17.517828642534006, 16.059558795895242, 31.906912335875628),
			Block.makeCuboidShape(-5.387981784634988, 13.577132490237098, -15.596303439715296, 21.387981784634988, 15.306640705306398, 31.596301554700936),
			Block.makeCuboidShape(-4.6501174187225995, 14.31835029669537, -16, 20.6501174187226, 16.04785851176467, -15.011709591388971),
			Block.makeCuboidShape(19.82109744004447, 15.1001094604276, 27.523136077183796, 20.800068514381305, 16.033017322457273, 30.002107151520637),
			Block.makeCuboidShape(16.699931485618695, 15.1001094604276, -15.37313796219815, 17.899931485618694, 16.033017322457273, -13.37313796219815),
			Block.makeCuboidShape(-5.300068514381305, 15.1001094604276, 27.12686203780185, -4.100068514381306, 16.033017322457273, 29.42686203780185),
			Block.makeCuboidShape(19.199931485618695, 15.1001094604276, -12.87313796219815, 20.399931485618694, 16.033017322457273, -10.87313796219815),
			Block.makeCuboidShape(-3.050068514381305, 15.1001094604276, 29.87686203780185, -1.8500685143813058, 16.033017322457273, 31.87686203780185),
			Block.makeCuboidShape(17.32109744004447, 15.1001094604276, 29.249998114985644, 18.28109744004447, 16.033017322457273, 31.499998114985644),
			Block.makeCuboidShape(-5.678902559955532, 15.1001094604276, -13.250001885014356, -4.578902559955532, 16.033017322457273, -11.150001885014357),
			Block.makeCuboidShape(13.535616109285591, 2.2313271950196976, -11.68776009516495, 16.844687187168613, 12.780675751729, -8.378687132267569),
			Block.makeCuboidShape(-0.8446871871686135, 2.2313271950196976, 24.37868524725321, 2.4643838907144078, 12.780675751729, 27.68775821015059),
			Block.makeCuboidShape(-0.8446871871686135, 2.2313271950196976, -11.68776009516495, 2.4643838907144078, 12.780675751729, -8.378687132267569),
			Block.makeCuboidShape(14.257729766462036, -0.0595590315220349, -12.994961003176368, 18.188918259768883, 3.555710008919652, -9.063769211094392),
			Block.makeCuboidShape(-2.188918259768881, -0.0595590315220349, 25.063767326080033, 1.7422702335379636, 3.555710008919652, 28.994959118162008),
			Block.makeCuboidShape(-2.188918259768881, -0.0595590315220349, -12.994961003176368, 1.7422702335379636, 3.555710008919652, -9.063769211094392),
			Block.makeCuboidShape(13.271635399580042, 8.380633763034139, -12.656717796503038, 17.82432632237586, 13.732351170163899, -8.104025459946449),
			Block.makeCuboidShape(-1.8243263223758621, 8.380633763034139, 24.10402357493209, 2.7283646004199573, 13.732351170163899, 28.65671591148868),
			Block.makeCuboidShape(-1.8243263223758621, 8.380633763034139, -12.656717796503038, 2.7283646004199573, 13.732351170163899, -8.104025459946449),
			Block.makeCuboidShape(19.058509314150484, 13.588833127807861, 9.235362068256606, 21.529235335678056, 16.059559031522035, 27.744610243238718),
			Block.makeCuboidShape(-5.529235335678056, 13.588833127807861, -11.744612128253078, -3.058509314150484, 16.059559031522035, 6.764636046729034),
			Block.makeCuboidShape(-5.529235335678056, 13.588833127807861, 9.235362068256606, -3.058509314150484, 16.059559031522035, 27.744610243238718),
			Block.makeCuboidShape(-1.5193272289499564, 13.58883324562126, -15.906914220889988, 17.517828642534006, 16.059558795895242, -13.436188199362416),
			Block.makeCuboidShape(-4.6501174187225995, 14.31835029669537, 31.01170959138897, 20.6501174187226, 16.04785851176467, 32),
			Block.makeCuboidShape(17.69379379050351, 11.28682072182148, 27.994574457419233, 21.187928038163058, 13.778824255280897, 31.488708705078782),
			Block.makeCuboidShape(18.613778818776957, 11.261803989373703, 6.522066743881568, 21.08450484030453, 14.544563094317047, 8.992792765409138),
			Block.makeCuboidShape(-5.084504840304529, 11.261803989373703, 6.522066743881568, -2.6137788187769573, 14.544563094317047, 8.992792765409138),
			Block.makeCuboidShape(17.69379379050351, 11.28682072182148, -15.488710590093142, 21.187928038163058, 13.778824255280897, -11.994576342433593),
			Block.makeCuboidShape(-5.187928038163058, 11.28682072182148, 27.994574457419233, -1.6937937905035092, 13.778824255280897, 31.488708705078782),
			Block.makeCuboidShape(-5.187928038163058, 11.28682072182148, -15.488710590093142, -1.6937937905035092, 13.778824255280897, -11.994576342433593),
			Block.makeCuboidShape(1.594537888140656, 6.939150087081773, -9.441382827684123, 14.405462111859343, 14.160750961445682, 25.441380942669763),
			Block.makeCuboidShape(-5.638407827333626, 14.31835029669537, -16, -4.6501174187225995, 16.04785851176467, 31.99999811498564),
			Block.makeCuboidShape(-0.09187748490545289, 10.34175039370292, -11.20476286578262, 16.091877484905453, 14.24556777162674, 27.20476098076826)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(-15.999999057492822, 14.31835029669537, 20.650116476215423, 31.999999057492822, 16.04785851176467, 21.638406884826445),
			Block.makeCuboidShape(-11.687759152657769, 2.2313271950196976, 13.535615166778411, -8.378686189760387, 12.780675751729, 16.844686244661432),
			Block.makeCuboidShape(-12.994960060669186, -0.0595590315220349, 14.257728823954857, -9.06376826858721, 3.555710008919652, 18.188917317261705),
			Block.makeCuboidShape(-12.65671685399586, 8.380633763034139, 13.271634457072862, -8.10402451743927, 13.732351170163899, 17.824325379868682),
			Block.makeCuboidShape(9.235363010763786, 13.588833127807861, 19.058508371643306, 27.744611185745896, 16.059559031522035, 21.529234393170874),
			Block.makeCuboidShape(-15.90691327838281, 13.58883324562126, -1.5193281714571363, -13.436187256855234, 16.059558795895242, 17.517827700026828),
			Block.makeCuboidShape(-15.596302497208114, 13.577132490237098, -5.387982727142168, 31.596302497208114, 15.306640705306398, 21.38798084212781),
			Block.makeCuboidShape(31.011708648881793, 14.31835029669537, -4.650118361229779, 31.999999057492822, 16.04785851176467, 20.650116476215423),
			Block.makeCuboidShape(-13.149931485618694, 15.1001094604276, -4.876863922816206, -11.949931485618695, 16.033017322457273, -2.576863922816206),
			Block.makeCuboidShape(-15.376862980309028, 15.1001094604276, 17.699930543111517, -13.076862980309027, 16.033017322457273, 18.899930543111516),
			Block.makeCuboidShape(27.623137019690972, 15.1001094604276, -4.550069456888483, 29.923137019690973, 16.033017322457273, -3.350069456888484),
			Block.makeCuboidShape(29.076862980309027, 15.1001094604276, -2.8999324281258723, 31.376862980309028, 16.033017322457273, -1.699932428125873),
			Block.makeCuboidShape(29.576862980309027, 15.1001094604276, 17.850067571874128, 31.876862980309028, 16.033017322457273, 19.050067571874127),
			Block.makeCuboidShape(27.076862980309027, 15.1001094604276, 20.350067571874128, 29.376862980309028, 16.033017322457273, 21.550067571874127),
			Block.makeCuboidShape(-14.800068514381305, 15.1001094604276, -3.673137962198151, -13.600068514381306, 16.033017322457273, -1.3731379621981503),
			Block.makeCuboidShape(-12.626862980309028, 15.1001094604276, 19.94993054311152, -10.626862980309028, 16.033017322457273, 21.149930543111516),
			Block.makeCuboidShape(24.378686189760387, 2.2313271950196976, 13.535615166778411, 27.68775915265777, 12.780675751729, 16.844686244661432),
			Block.makeCuboidShape(-11.687759152657769, 2.2313271950196976, -0.8446881296757933, -8.378686189760387, 12.780675751729, 2.464382948207228),
			Block.makeCuboidShape(24.378686189760387, 2.2313271950196976, -0.8446881296757933, 27.68775915265777, 12.780675751729, 2.464382948207228),
			Block.makeCuboidShape(25.06376826858721, -0.0595590315220349, 14.257728823954857, 28.994960060669186, 3.555710008919652, 18.188917317261705),
			Block.makeCuboidShape(-12.994960060669186, -0.0595590315220349, -2.188919202276061, -9.06376826858721, 3.555710008919652, 1.7422692910307838),
			Block.makeCuboidShape(25.06376826858721, -0.0595590315220349, -2.188919202276061, 28.994960060669186, 3.555710008919652, 1.7422692910307838),
			Block.makeCuboidShape(24.10402451743927, 8.380633763034139, 13.271634457072862, 28.65671685399586, 13.732351170163899, 17.824325379868682),
			Block.makeCuboidShape(-12.65671685399586, 8.380633763034139, -1.824327264883042, -8.10402451743927, 13.732351170163899, 2.7283636579127775),
			Block.makeCuboidShape(24.10402451743927, 8.380633763034139, -1.824327264883042, 28.65671685399586, 13.732351170163899, 2.7283636579127775),
			Block.makeCuboidShape(-11.744611185745896, 13.588833127807861, 19.058508371643306, 6.764636989236214, 16.059559031522035, 21.529234393170874),
			Block.makeCuboidShape(9.235363010763786, 13.588833127807861, -5.529236278185236, 27.744611185745896, 16.059559031522035, -3.058510256657664),
			Block.makeCuboidShape(-11.744611185745896, 13.588833127807861, -5.529236278185236, 6.764636989236214, 16.059559031522035, -3.058510256657664),
			Block.makeCuboidShape(29.436187256855234, 13.58883324562126, -1.5193281714571363, 31.90691327838281, 16.059558795895242, 17.517827700026828),
			Block.makeCuboidShape(-16.000000942507178, 14.31835029669537, -4.650118361229779, -15.01171053389615, 16.04785851176467, 20.650116476215423),
			Block.makeCuboidShape(-15.488709647585964, 11.28682072182148, 17.693792847996328, -11.994575399926411, 13.778824255280897, 21.18792709565588),
			Block.makeCuboidShape(7.007206292083682, 11.261803989373703, 18.61377787626978, 9.477932313611252, 14.544563094317047, 21.084503897797347),
			Block.makeCuboidShape(7.007206292083682, 11.261803989373703, -5.084505782811709, 9.477932313611252, 14.544563094317047, -2.613779761284137),
			Block.makeCuboidShape(27.99457539992641, 11.28682072182148, 17.693792847996328, 31.488709647585964, 13.778824255280897, 21.18792709565588),
			Block.makeCuboidShape(-15.488709647585964, 11.28682072182148, -5.187928980670238, -11.994575399926411, 13.778824255280897, -1.693794733010689),
			Block.makeCuboidShape(27.99457539992641, 11.28682072182148, -5.187928980670238, 31.488709647585964, 13.778824255280897, -1.693794733010689),
			Block.makeCuboidShape(-9.441381885176945, 6.939150087081773, 1.5945369456334761, 25.441381885176945, 14.160750961445682, 14.405461169352163),
			Block.makeCuboidShape(-15.999999057492822, 14.31835029669537, -5.638408769840806, 31.999999057492822, 16.04785851176467, -4.650118361229779),
			Block.makeCuboidShape(-11.204761923275441, 10.34175039370292, -0.09187842741263275, 27.20476192327544, 14.24556777162674, 16.091876542398275)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(20.6501174187226, 14.31835029669537, -16, 21.638407827333626, 16.04785851176467, 31.99999811498564),
			Block.makeCuboidShape(13.535616109285591, 2.2313271950196976, 24.37868524725321, 16.844687187168613, 12.780675751729, 27.68775821015059),
			Block.makeCuboidShape(14.257729766462036, -0.0595590315220349, 25.063767326080033, 18.188918259768883, 3.555710008919652, 28.994959118162008),
			Block.makeCuboidShape(13.271635399580042, 8.380633763034139, 24.10402357493209, 17.82432632237586, 13.732351170163899, 28.65671591148868),
			Block.makeCuboidShape(19.058509314150484, 13.588833127807861, -11.744612128253078, 21.529235335678056, 16.059559031522035, 6.764636046729034),
			Block.makeCuboidShape(-1.5193272289499564, 13.58883324562126, 29.436186314348056, 17.517828642534006, 16.059558795895242, 31.906912335875628),
			Block.makeCuboidShape(-5.387981784634988, 13.577132490237098, -15.596303439715296, 21.387981784634988, 15.306640705306398, 31.596301554700936),
			Block.makeCuboidShape(-4.6501174187225995, 14.31835029669537, -16, 20.6501174187226, 16.04785851176467, -15.011709591388971),
			Block.makeCuboidShape(19.82109744004447, 15.1001094604276, 27.523136077183796, 20.800068514381305, 16.033017322457273, 30.002107151520637),
			Block.makeCuboidShape(16.699931485618695, 15.1001094604276, -15.37313796219815, 17.899931485618694, 16.033017322457273, -13.37313796219815),
			Block.makeCuboidShape(-5.300068514381305, 15.1001094604276, 27.12686203780185, -4.100068514381306, 16.033017322457273, 29.42686203780185),
			Block.makeCuboidShape(19.199931485618695, 15.1001094604276, -12.87313796219815, 20.399931485618694, 16.033017322457273, -10.87313796219815),
			Block.makeCuboidShape(-3.050068514381305, 15.1001094604276, 29.87686203780185, -1.8500685143813058, 16.033017322457273, 31.87686203780185),
			Block.makeCuboidShape(17.32109744004447, 15.1001094604276, 29.249998114985644, 18.28109744004447, 16.033017322457273, 31.499998114985644),
			Block.makeCuboidShape(-5.678902559955532, 15.1001094604276, -13.250001885014356, -4.578902559955532, 16.033017322457273, -11.150001885014357),
			Block.makeCuboidShape(13.535616109285591, 2.2313271950196976, -11.68776009516495, 16.844687187168613, 12.780675751729, -8.378687132267569),
			Block.makeCuboidShape(-0.8446871871686135, 2.2313271950196976, 24.37868524725321, 2.4643838907144078, 12.780675751729, 27.68775821015059),
			Block.makeCuboidShape(-0.8446871871686135, 2.2313271950196976, -11.68776009516495, 2.4643838907144078, 12.780675751729, -8.378687132267569),
			Block.makeCuboidShape(14.257729766462036, -0.0595590315220349, -12.994961003176368, 18.188918259768883, 3.555710008919652, -9.063769211094392),
			Block.makeCuboidShape(-2.188918259768881, -0.0595590315220349, 25.063767326080033, 1.7422702335379636, 3.555710008919652, 28.994959118162008),
			Block.makeCuboidShape(-2.188918259768881, -0.0595590315220349, -12.994961003176368, 1.7422702335379636, 3.555710008919652, -9.063769211094392),
			Block.makeCuboidShape(13.271635399580042, 8.380633763034139, -12.656717796503038, 17.82432632237586, 13.732351170163899, -8.104025459946449),
			Block.makeCuboidShape(-1.8243263223758621, 8.380633763034139, 24.10402357493209, 2.7283646004199573, 13.732351170163899, 28.65671591148868),
			Block.makeCuboidShape(-1.8243263223758621, 8.380633763034139, -12.656717796503038, 2.7283646004199573, 13.732351170163899, -8.104025459946449),
			Block.makeCuboidShape(19.058509314150484, 13.588833127807861, 9.235362068256606, 21.529235335678056, 16.059559031522035, 27.744610243238718),
			Block.makeCuboidShape(-5.529235335678056, 13.588833127807861, -11.744612128253078, -3.058509314150484, 16.059559031522035, 6.764636046729034),
			Block.makeCuboidShape(-5.529235335678056, 13.588833127807861, 9.235362068256606, -3.058509314150484, 16.059559031522035, 27.744610243238718),
			Block.makeCuboidShape(-1.5193272289499564, 13.58883324562126, -15.906914220889988, 17.517828642534006, 16.059558795895242, -13.436188199362416),
			Block.makeCuboidShape(-4.6501174187225995, 14.31835029669537, 31.01170959138897, 20.6501174187226, 16.04785851176467, 32),
			Block.makeCuboidShape(17.69379379050351, 11.28682072182148, 27.994574457419233, 21.187928038163058, 13.778824255280897, 31.488708705078782),
			Block.makeCuboidShape(18.613778818776957, 11.261803989373703, 6.522066743881568, 21.08450484030453, 14.544563094317047, 8.992792765409138),
			Block.makeCuboidShape(-5.084504840304529, 11.261803989373703, 6.522066743881568, -2.6137788187769573, 14.544563094317047, 8.992792765409138),
			Block.makeCuboidShape(17.69379379050351, 11.28682072182148, -15.488710590093142, 21.187928038163058, 13.778824255280897, -11.994576342433593),
			Block.makeCuboidShape(-5.187928038163058, 11.28682072182148, 27.994574457419233, -1.6937937905035092, 13.778824255280897, 31.488708705078782),
			Block.makeCuboidShape(-5.187928038163058, 11.28682072182148, -15.488710590093142, -1.6937937905035092, 13.778824255280897, -11.994576342433593),
			Block.makeCuboidShape(1.594537888140656, 6.939150087081773, -9.441382827684123, 14.405462111859343, 14.160750961445682, 25.441380942669763),
			Block.makeCuboidShape(-5.638407827333626, 14.31835029669537, -16, -4.6501174187225995, 16.04785851176467, 31.99999811498564),
			Block.makeCuboidShape(-0.09187748490545289, 10.34175039370292, -11.20476286578262, 16.091877484905453, 14.24556777162674, 27.20476098076826)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(-15.999999057492822, 14.31835029669537, 20.650116476215423, 31.999999057492822, 16.04785851176467, 21.638406884826445),
			Block.makeCuboidShape(-11.687759152657769, 2.2313271950196976, 13.535615166778411, -8.378686189760387, 12.780675751729, 16.844686244661432),
			Block.makeCuboidShape(-12.994960060669186, -0.0595590315220349, 14.257728823954857, -9.06376826858721, 3.555710008919652, 18.188917317261705),
			Block.makeCuboidShape(-12.65671685399586, 8.380633763034139, 13.271634457072862, -8.10402451743927, 13.732351170163899, 17.824325379868682),
			Block.makeCuboidShape(9.235363010763786, 13.588833127807861, 19.058508371643306, 27.744611185745896, 16.059559031522035, 21.529234393170874),
			Block.makeCuboidShape(-15.90691327838281, 13.58883324562126, -1.5193281714571363, -13.436187256855234, 16.059558795895242, 17.517827700026828),
			Block.makeCuboidShape(-15.596302497208114, 13.577132490237098, -5.387982727142168, 31.596302497208114, 15.306640705306398, 21.38798084212781),
			Block.makeCuboidShape(31.011708648881793, 14.31835029669537, -4.650118361229779, 31.999999057492822, 16.04785851176467, 20.650116476215423),
			Block.makeCuboidShape(-13.149931485618694, 15.1001094604276, -4.876863922816206, -11.949931485618695, 16.033017322457273, -2.576863922816206),
			Block.makeCuboidShape(-15.376862980309028, 15.1001094604276, 17.699930543111517, -13.076862980309027, 16.033017322457273, 18.899930543111516),
			Block.makeCuboidShape(27.623137019690972, 15.1001094604276, -4.550069456888483, 29.923137019690973, 16.033017322457273, -3.350069456888484),
			Block.makeCuboidShape(29.076862980309027, 15.1001094604276, -2.8999324281258723, 31.376862980309028, 16.033017322457273, -1.699932428125873),
			Block.makeCuboidShape(29.576862980309027, 15.1001094604276, 17.850067571874128, 31.876862980309028, 16.033017322457273, 19.050067571874127),
			Block.makeCuboidShape(27.076862980309027, 15.1001094604276, 20.350067571874128, 29.376862980309028, 16.033017322457273, 21.550067571874127),
			Block.makeCuboidShape(-14.800068514381305, 15.1001094604276, -3.673137962198151, -13.600068514381306, 16.033017322457273, -1.3731379621981503),
			Block.makeCuboidShape(-12.626862980309028, 15.1001094604276, 19.94993054311152, -10.626862980309028, 16.033017322457273, 21.149930543111516),
			Block.makeCuboidShape(24.378686189760387, 2.2313271950196976, 13.535615166778411, 27.68775915265777, 12.780675751729, 16.844686244661432),
			Block.makeCuboidShape(-11.687759152657769, 2.2313271950196976, -0.8446881296757933, -8.378686189760387, 12.780675751729, 2.464382948207228),
			Block.makeCuboidShape(24.378686189760387, 2.2313271950196976, -0.8446881296757933, 27.68775915265777, 12.780675751729, 2.464382948207228),
			Block.makeCuboidShape(25.06376826858721, -0.0595590315220349, 14.257728823954857, 28.994960060669186, 3.555710008919652, 18.188917317261705),
			Block.makeCuboidShape(-12.994960060669186, -0.0595590315220349, -2.188919202276061, -9.06376826858721, 3.555710008919652, 1.7422692910307838),
			Block.makeCuboidShape(25.06376826858721, -0.0595590315220349, -2.188919202276061, 28.994960060669186, 3.555710008919652, 1.7422692910307838),
			Block.makeCuboidShape(24.10402451743927, 8.380633763034139, 13.271634457072862, 28.65671685399586, 13.732351170163899, 17.824325379868682),
			Block.makeCuboidShape(-12.65671685399586, 8.380633763034139, -1.824327264883042, -8.10402451743927, 13.732351170163899, 2.7283636579127775),
			Block.makeCuboidShape(24.10402451743927, 8.380633763034139, -1.824327264883042, 28.65671685399586, 13.732351170163899, 2.7283636579127775),
			Block.makeCuboidShape(-11.744611185745896, 13.588833127807861, 19.058508371643306, 6.764636989236214, 16.059559031522035, 21.529234393170874),
			Block.makeCuboidShape(9.235363010763786, 13.588833127807861, -5.529236278185236, 27.744611185745896, 16.059559031522035, -3.058510256657664),
			Block.makeCuboidShape(-11.744611185745896, 13.588833127807861, -5.529236278185236, 6.764636989236214, 16.059559031522035, -3.058510256657664),
			Block.makeCuboidShape(29.436187256855234, 13.58883324562126, -1.5193281714571363, 31.90691327838281, 16.059558795895242, 17.517827700026828),
			Block.makeCuboidShape(-16.000000942507178, 14.31835029669537, -4.650118361229779, -15.01171053389615, 16.04785851176467, 20.650116476215423),
			Block.makeCuboidShape(-15.488709647585964, 11.28682072182148, 17.693792847996328, -11.994575399926411, 13.778824255280897, 21.18792709565588),
			Block.makeCuboidShape(7.007206292083682, 11.261803989373703, 18.61377787626978, 9.477932313611252, 14.544563094317047, 21.084503897797347),
			Block.makeCuboidShape(7.007206292083682, 11.261803989373703, -5.084505782811709, 9.477932313611252, 14.544563094317047, -2.613779761284137),
			Block.makeCuboidShape(27.99457539992641, 11.28682072182148, 17.693792847996328, 31.488709647585964, 13.778824255280897, 21.18792709565588),
			Block.makeCuboidShape(-15.488709647585964, 11.28682072182148, -5.187928980670238, -11.994575399926411, 13.778824255280897, -1.693794733010689),
			Block.makeCuboidShape(27.99457539992641, 11.28682072182148, -5.187928980670238, 31.488709647585964, 13.778824255280897, -1.693794733010689),
			Block.makeCuboidShape(-9.441381885176945, 6.939150087081773, 1.5945369456334761, 25.441381885176945, 14.160750961445682, 14.405461169352163),
			Block.makeCuboidShape(-15.999999057492822, 14.31835029669537, -5.638408769840806, 31.999999057492822, 16.04785851176467, -4.650118361229779),
			Block.makeCuboidShape(-11.204761923275441, 10.34175039370292, -0.09187842741263275, 27.20476192327544, 14.24556777162674, 16.091876542398275)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	

	public Pool_Table(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch (state.get(FACING)) {
		case NORTH:
			return SHAPE_N;
		case SOUTH:
			return SHAPE_S;
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		default:
			return SHAPE_N;
		}
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}

	
	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	
}