package app.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import app.R
import app.ui.Paletting
import app.utils.ComposeUtils.FancyText2
import app.utils.ComposeUtils.RoomPopup
import com.godaddy.android.colorpicker.ClassicColorPicker
import com.godaddy.android.colorpicker.HsvColor
import kotlin.math.ceil

object PopupColorPicker {

    @Composable
    fun ColorPickingPopup(
        visibilityState: MutableState<Boolean>,
        initialColor: HsvColor = HsvColor.from(Color.Black),
        multiple: Boolean = false,
        onColorChanged: (HsvColor) -> Unit,
    ) {
        return RoomPopup(
            dialogOpen = visibilityState.value,
            widthPercent = 0.5f,
            heightPercent = 0.85f,
            strokeWidth = 0.5f,
            cardBackgroundColor = Color.DarkGray,
            onDismiss = { visibilityState.value = false }
        ) {
            val color = remember { mutableStateOf(initialColor) }

            ConstraintLayout(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(6.dp)
            ) {

                val (title, picker, button, previewcolor) = createRefs()

                /* The title */
                FancyText2(
                    modifier = Modifier.constrainAs(title) {
                        top.linkTo(parent.top, 12.dp)
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                    },
                    string = "Pick a Color",
                    solid = Color.Black,
                    size = 18f,
                    font = Font(R.font.directive4bold)
                )

                /* The card that holds the color picker */
                ClassicColorPicker(
                    modifier = Modifier
                        .fillMaxSize()
                        .constrainAs(picker) {
                            top.linkTo(title.bottom, 8.dp)
                            absoluteLeft.linkTo(parent.absoluteLeft)
                            absoluteRight.linkTo(parent.absoluteRight)
                            bottom.linkTo(button.top, 12.dp)
                            width = Dimension.percent(0.9f)
                            height = Dimension.fillToConstraints
                        },
                    color = initialColor,
                    onColorChanged = { clr: HsvColor ->
                        color.value = clr
                        onColorChanged(clr)
                    }
                )

                /* Exit button */
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Paletting.OLD_SP_YELLOW),
                    border = BorderStroke(width = 1.dp, color = Color.Black),
                    modifier = Modifier.constrainAs(button) {
                        bottom.linkTo(parent.bottom, 4.dp)
                        end.linkTo(parent.end, 12.dp)
                        start.linkTo(parent.start, 12.dp)
                        width = Dimension.wrapContent
                    },
                    onClick = {
                        visibilityState.value = false
                    },
                ) {
                    Icon(imageVector = Icons.Filled.Done, "", tint = Color.Black)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(stringResource(R.string.done), fontSize = 14.sp, color = Color.Black)
                }

                Surface(
                    color = color.value.toColor(),
                    border = BorderStroke(0.5.dp, Color.Gray),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .constrainAs(previewcolor) {
                            top.linkTo(button.top, 6.dp)
                            bottom.linkTo(button.bottom, 6.dp)
                            absoluteRight.linkTo(parent.absoluteRight, 16.dp)
                            absoluteLeft.linkTo(button.absoluteRight, 16.dp)
                            height = Dimension.fillToConstraints
                            width = Dimension.fillToConstraints
                        }
                ) {
                    Canvas(modifier = Modifier
                        .fillMaxSize()
                        .alpha(1.0f - color.value.alpha)) {
                        clipRect {
                            val darkColor = Color.LightGray
                            val lightColor = Color.White

                            val gridSizePx = 6.dp.toPx()
                            val cellCountX = ceil(this.size.width / gridSizePx).toInt()
                            val cellCountY = ceil(this.size.height / gridSizePx).toInt()
                            for (i in 0 until cellCountX) {
                                for (j in 0 until cellCountY) {
                                    val checkeredcolor = if ((i + j) % 2 == 0) darkColor else lightColor

                                    val x = i * gridSizePx
                                    val y = j * gridSizePx
                                    drawRect(checkeredcolor, Offset(x, y), Size(gridSizePx, gridSizePx))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}