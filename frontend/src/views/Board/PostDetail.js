import React from 'react';

// @material-ui/core
import { makeStyles } from "@material-ui/core/styles";

// component
import GridContainer from "components/Grid/GridContainer.js";
import GridItem from "components/Grid/GridItem.js";
import Card from "components/Card/Card.js";
import CardHeader from "components/Card/CardHeader.js";
import CardBody from "components/Card/CardBody.js";
import CommentList from 'components/Board/CommentList';

// 스타일(꾸미는 용)
import DetailPost from 'components/Board/DetailPost';

// 카드 타이틀 스타일
const styles = {
    cardTitleWhite: {
        color: "#FFFFFF",
        marginTop: "0px",
        minHeight: "auto",
        fontWeight: "300",
        fontFamily: "'Roboto', 'Helvetica', 'Arial', sans-serif",
        marginBottom: "3px",
        textDecoration: "none",
        "& small": {
            color: "#777",
            fontSize: "65%",
            fontWeight: "400",
            lineHeight: "1"
        }
    }
};

const cartTitleStyles = makeStyles(styles);

export default function PostDetail(props) {
    const classesCartTitle = cartTitleStyles();
    const [modal, setModal] = React.useState(false);
    const { board_id, btitle } = props.location.state;
    return (
        <div>
            <GridContainer>
                <GridItem xs={12} sm={12} md={12}>
                    <Card>
                        <CardHeader color="info">
                            <h2 className={classesCartTitle.cardTitleWhite}>{btitle}</h2>
                        </CardHeader>
                        <CardBody>
                            <DetailPost post_id={board_id}></DetailPost>
                        </CardBody>
                    </Card>
                </GridItem>
            </GridContainer>
            <GridContainer>
                <GridItem xs={12} sm={12} md={12}>
                    <CommentList post_id={board_id}></CommentList>
                </GridItem>
            </GridContainer>
        </div >
    );
}
